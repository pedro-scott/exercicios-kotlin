fun main() {
    print("Bem-vindo ao ByteBank, o seu Banco Digital :D\n\n")

    //Criando contas
    val contas = mutableListOf(
        Conta(nome = "Pedro", numero = 1000),
        Conta(numero = 1001, nome = "Alex"),
        Conta(nome = "João", numero = 1002)
    )

    //Mostrando dados das contas criadas
    contas.forEach {
        print("Titular: ${it.nome}\n")
        print("Número: ${it.numero}\n")
        print("Saldo: ${it.saldo}\n")
        println()
    }

    println()

    //Variaveis auxiliares
    var valorDeposito = 500.0
    var valorSaque = 200.0
    var valorTED = 250.0
    var destino = 0

    //Realizando operações bancárias
    contas.forEach {
        if (it == contas.last())
            destino--
        else
            destino++

        print("* Operações na conta do ${it.nome} *\n\n")

        if (it.depositar(valor = valorDeposito))
            print("Depósito na conta ${it.numero} realizado com sucesso :)\n")
        else
            print("Não foi possível realizar o depósito :(\n")
        print("Saldo Atual R$${it.saldo}\n")

        if (it.transferir(valor = valorTED, destinatario = contas[destino]))
            print("Tranferência da conta ${it.numero} para a conta ${contas[destino].numero} realizado com sucesso :)\n")
        else
            print("Transferência não autorizada :(\n")
        print("Saldo atual conta ${it.numero} R$${it.saldo}\n")
        print("Saldo atual conta ${contas[destino].numero} R$${contas[destino].saldo}\n")

        if (it.sacar(valor = valorSaque))
            print("Saque na conta ${it.numero} realizado com sucesso :)\n")
        else
            print("Saque não autorizado :(\n")
        print("Saldo Atual R$${it.saldo}\n")

        println()

        valorDeposito -= 100
        valorSaque += 50
        valorTED -= 50
    }
}