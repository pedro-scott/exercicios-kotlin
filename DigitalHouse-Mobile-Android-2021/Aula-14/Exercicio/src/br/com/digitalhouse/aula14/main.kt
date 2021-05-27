package br.com.digitalhouse.aula14

import br.com.digitalhouse.aula14.modelo.*

fun main() {
    val fornecedor = Fornecedor()
    var opcao: Int?

    do {
        opcao = fornecedor.menu
        println()

        when (opcao) {
            1 -> {
                fornecedor.entrar(
                    {
                        print("Qual a descrição do produto que deseja adicionar? ")
                        return@entrar readLine()
                    },
                    {
                        print("Qual o preço desse produto? ")
                        return@entrar readLine()?.toDouble()
                    }
                )
                println()
            }

            2 -> {
                fornecedor.listarProdutos
                println()
            }

            3 -> println("Saindo...\n")

            else -> println("Opção Inválida\n")
        }
    } while(opcao != 3)
}

//fun criarReader(): Scanner = Scanner(System.`in`)
//
//fun lerInt(reader: Scanner) : Int = reader.nextInt()
//
//fun lerDouble(reader: Scanner) : Double = reader.nextDouble()