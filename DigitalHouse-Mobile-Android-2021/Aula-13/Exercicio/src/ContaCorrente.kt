class ContaCorrente(override val numeroConta: Int) : ContaBancaria() {
    override var saldo = 0.0
    private val taxaOperacao = 5.0

    override fun depositar(valor: Double) : Boolean = when {
        valor > taxaOperacao -> {
            saldo += valor - taxaOperacao
            true
        }
        else -> false
    }

    override fun sacar(valor: Double): Boolean = when {
        saldo >= valor + taxaOperacao -> {
            saldo -= valor + taxaOperacao
            true
        }
        else -> false
    }

    override fun mostraDados() {
        println("Conta Nº: $numeroConta")
        println("Saldo R$${saldo}")
        println("Valor da Taxa de Operação R$$taxaOperacao")
    }
}