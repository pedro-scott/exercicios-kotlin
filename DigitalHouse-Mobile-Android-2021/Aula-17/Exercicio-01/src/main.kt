fun main() {
    val strings = mutableListOf<String>()

    strings.add("Pato")
    strings.add("Cachorro")
    strings.add("Gato")

//    println(strings.getOrNull(index = 3) ?: "Elemento não encontrado!")

    try {
        println(strings[3])
    } catch (e: IndexOutOfBoundsException) {
        println(e.localizedMessage)
        println("Exception: IndexOutOfBoundsException")
        println("Arquivo main")
    }
}