fun main() {
//    val strings: MutableList<String>? = null
//
//    strings?.add("Pato")
//    strings?.add("Cachorro")
//    strings?.add("Gato")
//
//    println(strings?.get(index = 2) ?: """
//        |Lista Nula
//        |Arquivo main
//        |Linha: 2
//    """.trimMargin())

    val strings: MutableList<String> = mutableListOf()

    try {
        println(strings[5])
    } catch (e: IndexOutOfBoundsException) {
        println(e.localizedMessage)
        println("Exception: IndexOutOfBoundsException")
        println("Arquivo main")
        println("Método Divisão Classe CalculoMatematico")
    }
}