import java.util.Scanner

fun testaBanco() {
    //Instanciando Banco
    val banco = Banco(listaContas = mutableListOf<ContaBancaria>())

    //Armazenam as opções do usuário
    var opcao1: Int
    var opcao2: Int
    var opcao3: Int

    //Atribuem valores aos números das contas automáticamente
    var numeroDisponivelCorrente = 1
    var numeroDisponivelPoupanca = 1000

    //Armazena a conta selecionada
    var contaSelecionada: ContaBancaria?

    //Repete o menu principal enquanto não pedir para finalizar o programa
    do {
        println("Bem vindo ao DH Bank :D\n")

        //Primeiro Menu
        do {
            menu1()
            opcao1 = lerInt()
            imprimiDivisor()
        } while (opcao1 < 1 || opcao1 > 5)

        when (opcao1) {
            //Criar Conta
            1 -> {
                //Segundo Menu
                do {
                    menu2()
                    opcao2 = lerInt()
                    imprimiDivisor()
                } while (opcao2 < 1 || opcao2 > 2)

                //Cria uma conta de acordo com as escolhas do usuário
                criarConta(
                    opcao = opcao2,
                    banco = banco,
                    numeroDisponivelCorrente = numeroDisponivelCorrente,
                    numeroDisponivelPoupanca = numeroDisponivelPoupanca
                )

                //Informa o número da conta criada e incrementa as variáveis auxiliares
                when (opcao2) {
                    1 -> {
                        println("Conta Corrente Nº $numeroDisponivelCorrente criada com Sucesso :D")
                        imprimiDivisor()
                        numeroDisponivelCorrente++
                    }
                    2 -> {
                        println("Conta Poupança Nº $numeroDisponivelPoupanca criada com Sucesso :D")
                        imprimiDivisor()
                        numeroDisponivelPoupanca++
                    }
                }
            }

            //Selecionar Conta
            2 -> {
                //Busca a conta informada e armazena
                contaSelecionada = selecionarConta(banco = banco)

                when (contaSelecionada) {
                    //Informa que a conta não existe
                    null -> {
                        println("Conta Inexistente :(")
                        imprimiDivisor()
                    }
                    else -> {
                        //Repeto menu de Selecionar Conta enquanto não pedir para voltar para o menu anterior
                        do {
                            //Terceiro Menu
                            do {
                                menu3(contaSelecionada.numeroConta)
                                opcao3 = lerInt()
                                imprimiDivisor()
                            } while (opcao3 < 1 || opcao3 > 5)

                            when (opcao3) {
                                //Depositar
                                1 -> {
                                    //Coletando valor para deposito
                                    print("Depositar selecionado! Digite o valor que deseja depositar: ")
                                    val valorDeposito: Double = lerDouble()
                                    imprimiDivisor()

                                    //Deposita na conta e informa se conseguiu ou não realizar o depósito
                                    depositarContaSelecionada(
                                        contaSelecionada = contaSelecionada,
                                        valorDeposito = valorDeposito
                                    )
                                }

                                //Sacar
                                2 -> {
                                    //Coletando valor para saque
                                    print("Saque selecionado! Digite o valor que deseja sacar: ")
                                    val valorSaque = lerDouble()
                                    imprimiDivisor()

                                    //Saca na conta e informa se conseguiu ou não realizar o saque
                                    sacarContaSelecionada(contaSelecionada = contaSelecionada, valorSaque = valorSaque)
                                }

                                //Transferir
                                3 -> {
                                    //Coletando destinatário do TED
                                    print("Transferir selecionado! Digite o numero da conta do destinatario: ")
                                    val numeroDestinatario = lerInt()
                                    imprimiDivisor()

                                    //Armazena a conta destinatária
                                    val destinatario = banco.procurarConta(numeroConta = numeroDestinatario)

                                    when (destinatario) {
                                        //Informa que o destinatário não existe
                                        null -> {
                                            println("Destinatário Inexistente :(")
                                            imprimiDivisor()
                                        }
                                        else -> {
                                            //Coletando valor para TED
                                            print("Perfeito! Agora... Digite o valor que deseja transferir: ")
                                            val valorTED = lerDouble()
                                            imprimiDivisor()

                                            //Transfere da conta selecionada para o destinatário e informa se conseguiu
                                            // ou não realizar o TED
                                            transferirContaSelecionada(
                                                contaSelecionada = contaSelecionada,
                                                valorTED = valorTED,
                                                destinatario = destinatario
                                            )
                                        }
                                    }
                                }

                                //Gerar Relátio Conta Selecionada
                                4 -> {
                                    contaSelecionada.mostraDados()
                                    imprimiDivisor()
                                }
                            }
                        } while (opcao3 != 5)
                    }
                }
            }

            //Remover Conta
            3 -> {
                //Busca a conta informada e armazena
                contaSelecionada = selecionarConta(banco = banco)

                when (contaSelecionada) {
                    //Informa que a conta não existe
                    null -> {
                        println("Conta Inexistente :(")
                        imprimiDivisor()
                    }
                    //Remove a Conta Informada
                    else -> removerConta(banco = banco, contaSelecionada = contaSelecionada)
                }
            }

            //Gerar Relatório Contas
            4 -> {
                banco.mostraDados()
                imprimiDivisor()
            }

            //Finalizar Programa
            5 -> {
                println("Até mais :D")
                imprimiDivisor()
            }
        }
    } while (opcao1 != 5)
}

//******************************************************************************** Funções do CRUD
fun criarConta(
    opcao: Int,
    banco: Banco,
    numeroDisponivelCorrente: Int,
    numeroDisponivelPoupanca: Int
) {
    when (opcao) {
        1 -> banco.inserir(ContaCorrente(numeroConta = numeroDisponivelCorrente))

        2 -> banco.inserir(ContaPoupanca(numeroConta = numeroDisponivelPoupanca))
    }
}

fun selecionarConta(banco: Banco) : ContaBancaria? {
    print("Muito bem! Por favor, digite o número da conta: ")
    val numeroContaExistente = lerInt()
    imprimiDivisor()

    return banco.procurarConta(numeroConta = numeroContaExistente)
}

fun depositarContaSelecionada(
    contaSelecionada: ContaBancaria,
    valorDeposito: Double
) {
    if (contaSelecionada.depositar(valor = valorDeposito)) {
        println("Depósito realizado com Sucesso :D")
        imprimiDivisor()
    } else {
        println("Não foi possível realizar o depósito :(")
        imprimiDivisor()
    }
}

fun sacarContaSelecionada(
    contaSelecionada: ContaBancaria,
    valorSaque: Double
) {
    if (contaSelecionada.sacar(valor = valorSaque)) {
        println("Saque realizado com Sucesso :D")
        imprimiDivisor()
    } else {
        println("Não foi possível realizar o saque :(")
        imprimiDivisor()
    }
}

fun transferirContaSelecionada(
    contaSelecionada: ContaBancaria,
    valorTED: Double,
    destinatario: ContaBancaria
) {
    if (contaSelecionada.tranferir(valor = valorTED, destinatario = destinatario)) {
        println("TED realizado com Sucesso :D")
        imprimiDivisor()
    } else {
        println("Não foi possível realizar o TED :(")
        imprimiDivisor()
    }
}

fun removerConta(
    banco: Banco,
    contaSelecionada: ContaBancaria
) {
    banco.remover(conta = contaSelecionada)
    println("Conta excluída com Sucesso :D")
    imprimiDivisor()
}

//******************************************************************************** Funções de Impressão e Leitura

fun imprimiDivisor() {
    println("----------------------------------------\n")
}

fun lerInt() : Int {
    val reader = Scanner(System.`in`)

    return reader.nextInt()
}

fun lerDouble() : Double {
    val reader = Scanner(System.`in`)

    return reader.nextDouble()
}

//******************************************************************************** Menus

fun menu1() {
    println("O que deseja fazer hoje?")
    println("1 - Criar conta")
    println("2 - Selecionar conta")
    println("3 - Remover conta")
    println("4 - Gerar relatório")
    println("5 - Finalizar\n")
    print("Escolha uma opção: ")
}

fun menu2() {
    println("Ótimo! Agora... Qual tipo de conta deseja criar?")
    println("1 - Corrente")
    println("2 - Poupança\n")
    print("Escolha uma opção: ")
}

fun menu3(numeroContaAcessada: Int) {
    println("Conta $numeroContaAcessada selecionada! O que você deseja fazer agora?")
    println("1 - Depositar")
    println("2 - Sacar")
    println("3 - Transferir")
    println("4 - Gerar relatório")
    println("5 - Retornar ao menu anterior\n")
    print("Escolha uma opção: ")
}