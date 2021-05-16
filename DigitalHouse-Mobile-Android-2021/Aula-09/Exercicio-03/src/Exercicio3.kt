fun main() {
    //Instanciando Estoque
    val estoqueMouse = Estoque(nome = "Razer Chroma", qtdAtual = 100u, qtdMinima = 10u)

    //Utilizando métodos da classe Estoque
    print("${estoqueMouse.mostra()}\n\n")

    print("* Mudando nome *\n")
    estoqueMouse.mudarNome(novoNome = "Razer")
    print("${estoqueMouse.mostra()}\n\n")

    print("* Mudando quantidade mínima *\n")
    estoqueMouse.mudarQtdMinima(novaQtdMinima = 20u)
    print("${estoqueMouse.mostra()}\n\n")

    if (estoqueMouse.precisaRepor()) {
        print("* Precisa Repor! *\n")
        estoqueMouse.repor(qtd = 50u)
    } else {
        print("* Precisa dar baixa! *\n")
        estoqueMouse.darBaixa(qtd = 50u)
    }
    print("${estoqueMouse.mostra()}\n\n")
}