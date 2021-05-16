class ContaCorrente (val clienteCorrente: Cliente): Conta(clienteCorrente) {
    var limiteChequeEspecial = 500.0
        private set

    override fun sacar(valor: Double) {
        if (valor <= saldo)
            super.sacar(valor = valor)
        else {
            if (valor - saldo <= limiteChequeEspecial) {
                limiteChequeEspecial -= (valor - saldo)
                super.sacar(valor = saldo)
            }
        }
    }

    fun depositarCheque(cheque: Cheque) {
        depositar(valor = cheque.valor)
    }
}