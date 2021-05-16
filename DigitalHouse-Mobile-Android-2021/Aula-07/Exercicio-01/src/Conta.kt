class Conta (
    val numeroConta: Int,
    val titular: Cliente
) {
    private var saldo = 0.0

    fun deposito(valor: Double) {
        if (valor > 0) {
            saldo += valor
            print("Depósito realizado com sucesso :)\n")
            print("Saldo atual R$$saldo\n")
        } else
            print("Depósito não realizado :(\n")
    }

    fun saque(valor: Double) {
        if (valor <= saldo && valor > 0) {
            saldo -= valor
            print("Saque realizado com sucesso :)\n")
            print("Saldo atual R$$saldo\n")
        } else
            print("Saldo insuficiente :(\n")
    }
}