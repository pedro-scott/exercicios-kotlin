fun main() {
    //Criando objetos
    val cadastros = mutableListOf(
        Aposentadoria(idade = 59, sexo = 'F', anosContribuicao = 30),
        Aposentadoria(idade = 66, sexo = 'M', anosContribuicao = 31)
    )

    //Verificando resultados dos métodos da classe
    cadastros.forEach {
        println(it.podeAposentar())
    }
}