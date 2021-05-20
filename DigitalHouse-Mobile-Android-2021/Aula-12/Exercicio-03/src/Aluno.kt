class Aluno (
    val nome: String,
    val numeroDeAluno: Int
) {
    override fun equals(other: Any?): Boolean {
        return when (val otherAluno = other as? Aluno) {
            is Aluno -> this.numeroDeAluno == otherAluno.numeroDeAluno
            else -> super.equals(other)
        }
    }
}