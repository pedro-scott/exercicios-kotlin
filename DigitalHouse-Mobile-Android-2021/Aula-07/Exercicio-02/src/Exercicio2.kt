fun main() {
    //Criando lista com jogadores
    val jogadores = mutableListOf(
        JogadorDeFutebol(nome = "Pelé", energia = 25, alegria = 0, gols = 0, experiencia = 10),
        JogadorDeFutebol(nome = "Neymar", energia = 50, alegria = 10, gols = 5, experiencia = 20),
    )

    //Criando sessão de treinamento
    val treinamento = SessaoDeTreinamento()

    //Realizando treinamentos
    jogadores.forEach {
        treinamento.treinarA(jogador = it)
        println()
    }
}