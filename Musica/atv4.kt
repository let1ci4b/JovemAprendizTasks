// Descrição: Classe para um app de reprodução de música

fun main(){
    val musica = Musica("In the end", "Linkin Park", 2000, 5000000)
    println(musica.printMusic())
    println(musica.printFama())
}

class Musica(
    val titulo: String, 
    val artista: String, 
    val anolancamento: Int, 
    val contReproducao: Int
){   
     fun printMusic() : String {
         return("$titulo, de $artista, lançado em $anolancamento.")
    }
     
     fun printFama() : Boolean {
         return(contReproducao >= 1000)
     }
}
