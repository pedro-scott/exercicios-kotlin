class ContaPoupanca (val clientePoupanca: Cliente): Conta(clientePoupanca) {
    var taxaJuros = 1.5
        private set

    fun recolherJuros() {
        depositar(valor = taxaJuros * saldo / 100)
    }
}