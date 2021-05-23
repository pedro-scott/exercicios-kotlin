fun testaContasDiferentes() {
//    val corrente = ContaCorrente(numeroConta = 100)
//    val poupanca = ContaPoupanca(numeroConta = 1000)
//    val relatorio = Relatorio()
//
//    println("** Depositando **")
//    corrente.depositar(valor = 1000.0)
//    poupanca.depositar(valor = 1000.0)
//
//    relatorio.gerarRelatorio(corrente)
//    println()
//    relatorio.gerarRelatorio(poupanca)
//    println()
//
//    println("** Sacando **")
//    corrente.sacar(valor = 400.0)
//    poupanca.sacar(valor = 1200.0)
//
//    relatorio.gerarRelatorio(corrente)
//    println()
//    relatorio.gerarRelatorio(poupanca)
//    println()
//
//    println("** Transferindo **")
//    corrente.tranferir(valor = 100.0, destinatario = poupanca)
//    poupanca.tranferir(valor = 200.0, destinatario = corrente)
//
//    relatorio.gerarRelatorio(corrente)
//    println()
//    relatorio.gerarRelatorio(poupanca)
//    println()

    //Criando lista com Objeto que herdam de ContaBancário e Imprimivel
    val contas = listOf(
        ContaCorrente(numeroConta = 100),
        ContaPoupanca(numeroConta = 1000)
    )
    //Utilizando o listIterator
    val contasIterator = contas.listIterator(index = 1)

    //Variáveis auxiliares para alterar o valor de saque e TED automaticamente
    var valorSaque = 400.0
    var valorTED = 100.0

    //Realizando movimentações bancárias
    contas.forEach {
        it.depositar(valor = 1000.0)
        it.sacar(valor = valorSaque)
        if (contasIterator.hasNext())
            it.tranferir(valor = valorTED, destinatario = contasIterator.next())
        else {
            contasIterator.previous()
            it.tranferir(valor = valorTED, destinatario = contasIterator.previous())
        }

        valorSaque += 800.0
        valorTED += 100.0
    }

    //Gerando os Relatórios após as movimentações
    val relatorio = Relatorio()

    contas.forEach {
        relatorio.gerarRelatorio(it)
        println()
    }
}