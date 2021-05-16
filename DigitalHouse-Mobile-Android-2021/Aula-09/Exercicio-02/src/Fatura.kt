class Fatura (val lista: List<Item>) {
    fun getTotalFatura(): Double {
        var total = 0.0

        lista.forEach {
            total += it.quantidade * it.preco
        }

        return total
    }
}