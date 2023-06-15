package com.example.listadecontatos

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.listadecontatos.databinding.MainlayoutBinding

class Main : ComponentActivity() {

    private lateinit var binding: MainlayoutBinding
    private val contacts = ArrayList<Contacts>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainlayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onClick()
    }

    private fun onClick(){
        with(binding) {

            buttonSave.setOnClickListener {
                val name = TextName.text.toString()
                val phone = TextPhone.text.toString()

                if (!listIsFull() && !invalidInputs(name, phone) && !phoneExists(name, phone)) {
                    val contact = Contacts(name, phone)
                    contacts.add(contact)
                    Toast.makeText(this@Main, "$name foi adicionado(a) com sucesso!", Toast.LENGTH_SHORT).show()
                }
            }

            buttonList.setOnClickListener {
                val intent = Intent(this@Main, com.example.listadecontatos.List::class.java)
                intent.putExtra("contato", contacts)
                startActivity(intent)
            }

            buttonClear.setOnClickListener {
                contacts.clear()
                Toast.makeText(this@Main, "Sua lista de contatos foi limpa!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun listIsFull() : Boolean {

        if (contacts.size >= 3) {
            Toast.makeText(this@Main, "Sua lista está cheia!", Toast.LENGTH_SHORT).show()
            return true
        } else {
            return false
        }
    }

    private fun invalidInputs(name: String, phone: String) : Boolean {

        if((name.isEmpty() || phone.isEmpty() || !phone.matches(Regex("[0-9]*")) || name.matches(Regex("[0-9]*"))) && !listIsFull()) {
            Toast.makeText(this@Main, "Preencha os campos corretamente!", Toast.LENGTH_SHORT).show()
            return true
        } else if(phone.length != 11 && !listIsFull()) {
            Toast.makeText(this@Main, "Telefone deve conter 11 digitos!", Toast.LENGTH_SHORT).show()
            return true
        } else {
            return false
        }
    }

    private fun phoneExists(name: String, phone: String) : Boolean {

        var exist = false

        for(Contacts in contacts){
            if(Contacts.phone.toString().equals(phone)) {
                exist = true
                break
            }
        }

        if (exist && !invalidInputs(name, phone) && !listIsFull()) {
            Toast.makeText(this@Main, "Este número já esta na lista!", Toast.LENGTH_SHORT).show()
        }
        return exist
    }
}