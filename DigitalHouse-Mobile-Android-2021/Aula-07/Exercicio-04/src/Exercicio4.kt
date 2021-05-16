fun main() {
    //Criando o tripé
    val tripe = Tripe(dobrado = false, alturaMaxima = 30.0, alturaMinima = 10.0, alturaAtual = 15.0)

    //Usando funções da classe Tripe
    imprimeTripe(tripe = tripe)
    tripe.definirAltura(novaAltura = 30.0)
    imprimeTripe(tripe = tripe)
    tripe.dobrar()
    imprimeTripe(tripe = tripe)
    tripe.desdobrar()
    imprimeTripe(tripe = tripe)
    tripe.guardar()
    imprimeTripe(tripe = tripe)
    print("Pronto para guardar: ${tripe.prontoParaGuardar()}\n\n")
    tripe.usar()
    imprimeTripe(tripe = tripe)
    print("Pronto para usar: ${tripe.prontoParaUsar()}\n\n")
}

fun imprimeTripe(tripe: Tripe) {
    print("Dobrado: ${tripe.dobrado}\n")
    print("Altura Atual: ${tripe.alturaAtual}\n")
    print("Altura Máxima: ${tripe.alturaMaxima}\n")
    print("Altura Mínima: ${tripe.alturaMinima}\n\n")
}