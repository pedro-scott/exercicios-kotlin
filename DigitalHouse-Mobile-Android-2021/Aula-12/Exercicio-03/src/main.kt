fun main() {
    val alunos = listOf(
        Aluno(
            nome = "Jao",
            numeroDeAluno = 11
        ),
        Aluno(
            nome = "Jean",
            numeroDeAluno = 22
        ),
        Aluno(
            nome = "Pedro",
            numeroDeAluno = 33
        ),
        Aluno(
            nome = "Vick",
            numeroDeAluno = 44
        )
    )

    val alunoNovo = Aluno(nome = "Nick", numeroDeAluno = 33)

    if (alunos.contains(alunoNovo))
        println("$alunoNovo está na lista")
    else
        println("$alunoNovo não está na lista")
}