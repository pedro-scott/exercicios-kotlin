fun main() {
    //Instanciando Contas Correntes e Poupanças
    val contasCorrente = mutableListOf(
        ContaCorrente(Cliente(numero = 1000, sobrenome = "Scott", rg = 1234, cpf = 4321)),
        ContaCorrente(Cliente(numero = 1001, sobrenome = "Henrique", rg = 5678, cpf = 8765))
    )

    val contasPoupancas = mutableListOf(
        ContaPoupanca(Cliente(numero = 100, sobrenome = "Augusto", rg = 101112, cpf = 121110)),
        ContaPoupanca(Cliente(numero = 101, sobrenome = "Beatriz", rg = 212121, cpf = 121212))
    )

    //Criando Variáveis Auxiliares
    var valorDeposito = 500.0
    var valorSaque = 650.0
    var valorCheque = 500.0

    //Realizando Operações CC
    contasCorrente.forEach {
        print("Titular: ${it.cliente.sobrenome}\n")
        print("CC: ${it.cliente.numero}\n")
        println("------------------------------------\n")

        it.depositar(valor = valorDeposito)
        print("Depositando R$$valorDeposito\n")
        it.consultarSaldo()
        println("Limite Cheque Especial R$${it.limiteChequeEspecial}")

        println()

        it.sacar(valor = valorSaque)
        print("Sacando R$$valorSaque\n")
        it.consultarSaldo()
        println("Limite Cheque Especial R$${it.limiteChequeEspecial}")

        println()

        for (i in 1..3) {
            it.depositarCheque(cheque = Cheque(valor = valorCheque, emissor = "Banco Inter", dataPagamento = 10052021))
        }
        print("Depositando cheques no valor de R$$valorCheque\n")
        it.consultarSaldo()
        println("Limite Cheque Especial R$${it.limiteChequeEspecial}\n")

        valorDeposito -= 250
        valorSaque += 650
        valorCheque -= 250
    }

    //Redefinindo Valores
    valorDeposito = 500.0
    valorSaque = 650.0

    //Realizando Operações CC
    contasPoupancas.forEach {
        print("Titular: ${it.cliente.sobrenome}\n")
        print("Poupança: ${it.cliente.numero}\n")
        println("------------------------------------\n")

        it.depositar(valor = valorDeposito)
        print("Depositando R$$valorDeposito\n")
        it.consultarSaldo()

        println()

        it.sacar(valor = valorSaque)
        print("Sacando R$$valorSaque\n")
        it.consultarSaldo()

        println()

        it.recolherJuros()
        print("Recolhendo juros\n")
        it.consultarSaldo()
        println()

        valorDeposito += 500
        valorSaque -= 200
    }
}