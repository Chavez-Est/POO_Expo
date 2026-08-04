class Hechizo(

    // Atributo que almacena el nombre del hechizo.
    val nombre: String,

    // Atributo que indica el elemento al que pertenece el hechizo.
    val elemento: String
) {


    // Método que simula el lanzamiento del hechizo.
    fun lanzar() {
        println("$nombre ha sido lanzado.")
    }
}

fun main() {

    // Creación de un objeto (instancia de la clase Hechizo).
    val lumos = Hechizo("Lumos", "Luz")

    // Llamada al método del objeto.
    lumos.lanzar()
}