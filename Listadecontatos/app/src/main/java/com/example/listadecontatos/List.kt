package com.example.listadecontatos

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.core.app.ActivityCompat
import com.example.listadecontatos.databinding.ListalayoutBinding

class List : ComponentActivity() {
    private lateinit var binding: ListalayoutBinding
    var contato1: Contacts? = null
    var contato2: Contacts? = null
    var contato3: Contacts? = null
    var REQUEST_PHONE_CALL = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ListalayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val contactList = intent.extras?.getSerializable("contato") as ArrayList<Contacts>
        loadContacts(contactList)

        with(binding) {

            contato1?.let {
                nomeContato1.text = it.name
                telefoneContato1.text = "("+it.phone?.substring(0,2)+")"+it.phone?.substring(2,7)+"-"+it.phone?.substring(7,11)
                layoutContato1.visibility = View.VISIBLE
            }

            contato2?.let {
                nomeContato2.text = it.name
                telefoneContato2.text = "("+it.phone?.substring(0,2)+")"+it.phone?.substring(2,7)+"-"+it.phone?.substring(7,11)
                layoutContato2.visibility = View.VISIBLE
            }

            contato3?.let {
                nomeContato3.text = it.name
                telefoneContato3.text = "("+it.phone?.substring(0,2)+")"+it.phone?.substring(2,7)+"-"+it.phone?.substring(7,11)
                layoutContato3.visibility = View.VISIBLE
            }

            iconPhone.setOnClickListener {
                makecall(contato1?.phone.toString())
            }

            iconPhone2.setOnClickListener {
                makecall(contato2?.phone.toString())
            }

            iconPhone3.setOnClickListener {
                makecall(contato3?.phone.toString())
            }

            btnReturn.setOnClickListener {
                hideFields()
                finish()
            }
        }
    }

    private fun makecall(contato: String){
        if (ActivityCompat.checkSelfPermission(this@List, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this@List, arrayOf(android.Manifest.permission.CALL_PHONE), REQUEST_PHONE_CALL)
        }

        val phone_intent = Intent(Intent.ACTION_CALL)
        phone_intent.data = Uri.parse("tel:" + contato)
        startActivity(phone_intent)
    }

    private fun loadContacts(contactList: ArrayList<Contacts>) {
        when (contactList.size) {

            1 -> {
                contato1 = contactList[0]
            }

            2 -> {
                contato1 = contactList[0]
                contato2 = contactList[1]
            }

            3 -> {
                contato1 = contactList[0]
                contato2 = contactList[1]
                contato3 = contactList[2]
            }

            else -> {}
        }
    }

    private fun hideFields() {
        with(binding) {
            layoutContato1.visibility = View.GONE
            layoutContato2.visibility = View.GONE
            layoutContato3.visibility = View.GONE
        }
    }
}
