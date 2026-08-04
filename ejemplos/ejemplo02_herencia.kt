// Clase padre que representa un ave.
open class Ave(

    // Atributo con el nombre del ave.
    val nombre: String
) {


    // Método que representa la acción de volar.
    fun volar() {
        println("$nombre está volando.")
    }
}


// Clase hija que hereda de la clase Ave.
class Aguila(nombre: String) : Ave(nombre) {


    // Método propio de la clase Aguila.
    fun cazar() {
        println("$nombre está cazando.")
    }
}

fun main() {

    // Se crea un objeto de la clase Aguila.
    val aguila = Aguila("Águila Real")

    // Método heredado de la clase Ave.
    aguila.volar()

    // Método propio de la clase Aguila.
    aguila.cazar()
}