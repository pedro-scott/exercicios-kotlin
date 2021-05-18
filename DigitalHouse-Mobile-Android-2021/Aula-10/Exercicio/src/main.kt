fun main() {
    //Criando variáveis auxiliares
    var opcao1: Int
    var opcao2: Int
    var localizacaoIngresso = ""

    //Menu de opções 1
    do {
        menu1()
        opcao1 = lerInt()
        println()
    } while (opcao1 < 1 || opcao1 > 2)

    if (opcao1 == 2) {
        //Menu de opções 2
        do {
            menu2()
            opcao2 = lerInt()
            println()
        } while (opcao2 < 1 || opcao2 > 2)

        opcao1 += opcao2

        if (opcao1 == 3) {
            do {
                //Menu de opções 3
                menu3()
                opcao2 = lerInt()
                println()
            } while (opcao2 < 1 || opcao2 > 4)

            localizacaoIngresso = when (opcao2) {
                1 -> "Ala Norte"
                2 -> "Ala Sul"
                3 -> "Ala Leste"
                else -> "Ala Oeste"
            }
        }
    }

    println("--------Ingresso Adquirido--------")
    imprimeInformacoes(
        ingresso1 = Normal(valor = 19.99),
        ingresso2 = CamaroteInferior(valor = 29.99, localizacaoIngresso = localizacaoIngresso),
        ingresso3 = CamaroteSuperior(valor = 29.99, adicional = 14.99),
        opcao = opcao1
    )
    println("------------------------------")
}