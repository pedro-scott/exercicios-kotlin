class Coca (
    val tamanho: Int,
    val preco: Double
) {
    override fun equals(other: Any?): Boolean {
        return when (val otherCoca = other as? Coca) {
            is Coca -> this.tamanho == otherCoca.tamanho
            else -> super.equals(other)
        }
    }

    override fun toString(): String = "Preço R$$preco (Tamanho $tamanho)"
}