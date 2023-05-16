// Descrição: Programa que mostra os detalhes do perfil de uma pessoa.

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    val bruno = Person("Bruno", 62, "read novels", atiqah)
    val luiza = Person("Luiza", 19, null, null)
    val maria = Person("Maria", 57, "embroider", bruno)
    
    val People = mutableListOf<Person>(amanda, atiqah, bruno, luiza, maria)
    
     People.forEach {
        it.showProfile()
    }
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
       println("Name: $name \nAge: $age")
       if(hobby != null) println("Likes to $hobby.") 
       if(referrer != null){
           print("Has a referrer named ${referrer.name}")
           if(referrer.hobby != null){
           		println(" who likes to ${referrer.hobby}.\n") 
           } else println(".\n")
       } else println("Doesn't have a referrer.\n")
    }
}