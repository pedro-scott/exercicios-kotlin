fun main() {
    val lista = mutableListOf<Int>()

    for (i in 1..10) { lista.add(i) }

    print(Numeros(listaNum = lista).retornaProduto())
}