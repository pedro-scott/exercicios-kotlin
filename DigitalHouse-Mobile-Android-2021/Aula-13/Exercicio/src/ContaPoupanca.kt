class ContaPoupanca(override val numeroConta: Int) : ContaBancaria() {
    override var saldo = 0.0
    private val limite = 500.0

    override fun depositar(valor: Double) : Boolean = when {
        valor > 0 -> {
            saldo += valor
            true
        }
        else -> false
    }

    override fun sacar(valor: Double): Boolean = when {
        saldo + limite >= valor -> {
            saldo -= valor
            true
        }
        else -> false
    }

    override fun mostraDados() {
        println("Conta Nº: $numeroConta")
        println("Saldo R$${saldo}")
        println("Limite Autorizado para a Conta R$$limite")
    }
}