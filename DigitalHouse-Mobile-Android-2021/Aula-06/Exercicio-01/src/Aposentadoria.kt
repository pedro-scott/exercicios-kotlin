class Aposentadoria (
    val idade: Int,
    val sexo: Char,
    val anosContribuicao: Int
) {
    fun podeAposentar(): Boolean {
        return ((sexo == 'M' && idade >= 65) || (sexo == 'F' && idade >= 60)) && anosContribuicao >= 30
    }
}