fun main(){
    val musica = Musica("In the end", "Linkin Park", 2000, 5000000)
    musica.printMusic()
    
}

class Musica
(val titulo: String, val artista: String, val anolancamento: Int, val contReproducao: Int)
{
     val famosa : Boolean 
     get() = contReproducao >= 1000
     
     fun printMusic() {
         print("$titulo, de $artista, lançado em $anolancamento.")
    }
}
