class Pessoa (
    val nome: String,
    val rg: Int
) {
    override fun equals(other: Any?): Boolean {
        return when (val otherPessoa = other as? Pessoa) {
            is Pessoa -> this.rg == otherPessoa.rg
            else -> super.equals(other)
        }
    }
}