fun main() {
    //Criando atletas
    val atletas = mutableListOf(
        Atleta(nome = "Pedro", nivel = 10, energia = 100),
        Atleta(nome = "João", nivel = 5, energia = 50)
    )

    //Criando provas
    val provas = mutableListOf(
        Prova(dificuldade = 10, energiaNecessaria = 100),
        Prova(dificuldade = 5, energiaNecessaria = 50),
        Prova(dificuldade = 1, energiaNecessaria = 10)
    )

    //Verificando os resultados
    atletas.forEach {
        print("Atleta ${it.nome}\n")
        for (i in 0 until 3) {
            print("Prova $i: ${provas[i].podeRealizar(it)}\n")
        }
        println()
    }
}