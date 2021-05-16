class Numeros (val listaNum: List<Int>) {
    fun retornaProduto(): Int {
        return listaNum.reduce { a, b -> a * b }
    }
}