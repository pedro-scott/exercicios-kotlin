class Prova {
    fun somaTotal(conjuntoInteiros: Set<Int>) : Int = conjuntoInteiros.reduce { sum, element -> sum + element }
}