open class Conta (val cliente: Cliente) {
    var saldo = 0.0
        private set

    fun depositar(valor: Double) {
        if (valor > 0)
            saldo += valor
    }

    open fun sacar(valor: Double) {
        if (valor <= saldo)
            saldo -= valor
    }

    fun consultarSaldo() {
        println("Saldo R$$saldo")
    }
}