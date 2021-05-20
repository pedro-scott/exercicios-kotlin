class Funcionario (
    val nome: String,
    val numeroDeRegistro: Int
) {
    override fun equals(other: Any?): Boolean {
        return when (val otherFuncionario = other as? Funcionario) {
            is Funcionario -> this.numeroDeRegistro == otherFuncionario.numeroDeRegistro
            else -> super.equals(other)
        }
    }
}