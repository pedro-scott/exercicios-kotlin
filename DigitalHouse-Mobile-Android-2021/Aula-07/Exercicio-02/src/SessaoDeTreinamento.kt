class SessaoDeTreinamento (val experiencia: Int = 1) {
    fun treinarA(jogador: JogadorDeFutebol) {
        print("Experiência atual do jogador ${jogador.nome}: ${jogador.experiencia}\n")

        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        jogador.experiencia += experiencia

        print("Experiência após o treinamento do jogador ${jogador.nome}: ${jogador.experiencia}\n")
    }
}