import java.util.Scanner

/*
    Caso queira trabalhar com outras bibliotecas sem me preocupar com as importações utilize: import java.util.*

    Dessa forma todas as funções de outras bibliotecas importarão ela automaticamente
*/


fun lerInt() : Int {
    //Criando reader para ler inteiros
    val reader = Scanner(System.`in`)

    //Retornando inteiro lido
    return reader.nextInt()
}

fun menu1() {
    println("Bem-vindo! Qual tipo de ingresso deseja adquirir?")
    println("1 - Normal")
    println("2 - VIP")
    print("\nEscolha uma opção: ")
}

fun menu2() {
    println("Qual tipo de ingresso VIP deseja adquirir?")
    println("1 - Camarote Inferior")
    println("2 - Camarote Superior")
    print("\nEscolha uma opção: ")
}

fun menu3() {
    println("Qual localização do Camarote Inferior deseja adquirir?")
    println("1 - Ala Norte")
    println("2 - Ala Sul")
    println("3 - Ala Leste")
    println("4 - Ala Oeste")
    print("\nEscolha uma opção: ")
}

fun imprimeInformacoes(
    ingresso1: Normal,
    ingresso2: CamaroteInferior,
    ingresso3: CamaroteSuperior,
    opcao: Int
) {
    when (opcao) {
        1 -> {
            ingresso1.imprimeTipoIngresso()
            ingresso1.imprimeValor()
        }
        3 -> {
            ingresso2.imprimeTipoIngresso()
            ingresso2.imprimeLocalizacaoIngresso()
            ingresso2.imprimeValor()
        }
        4 -> {
            ingresso3.imprimeTipoIngresso()
            ingresso3.imprimeValor()
        }
    }
}