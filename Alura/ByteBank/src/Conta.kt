class Conta (
    val nome: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

    fun depositar(valor: Double): Boolean {
        if (valor > 0) {
            saldo += valor
            return true
        }

        return false
    }

    fun sacar(valor: Double): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            return true
        }

        return false
    }

    fun transferir(destinatario: Conta, valor: Double): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destinatario.depositar(valor)
            return true
        }

        return false
    }
}