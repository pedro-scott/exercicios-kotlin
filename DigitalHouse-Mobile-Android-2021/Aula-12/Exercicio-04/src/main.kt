fun main() {
    val funcionarios = listOf(
        Funcionario(nome = "Jao", numeroDeRegistro = 111),
        Funcionario(nome = "Vick", numeroDeRegistro = 222),
        Funcionario(nome = "Nick", numeroDeRegistro = 333),
        Funcionario(nome = "Pedro", numeroDeRegistro = 444)
    )

    val novoFuncionario = Funcionario(nome = "Alex", numeroDeRegistro = 111)

    if (funcionarios.contains(novoFuncionario))
        println("${novoFuncionario.nome} está na lista")
    else
        println("${novoFuncionario.nome} não está na lista")
}