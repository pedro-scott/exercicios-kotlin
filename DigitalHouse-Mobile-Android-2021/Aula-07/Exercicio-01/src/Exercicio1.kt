fun main() {
    val clientes = mutableListOf(
        Cliente(nome = "Pedro", sobrenome = "Scott"),
        Cliente(nome = "Victor", sobrenome = "Scott")
    )
    val contas = mutableListOf(
        Conta(numeroConta = 1000, titular = clientes[0]),
        Conta(numeroConta = 1001, titular = clientes[1])
    )

    var valorDeposito = 250.0
    var valorSaque = 100.0

    contas.forEach {
        print("Titular: ${it.titular.nome} ${it.titular.sobrenome}\n")
        print("Conta: ${it.numeroConta}\n")
        it.deposito(valorDeposito)
        it.saque(valorSaque)
        println()
        valorDeposito += 250
        valorSaque += 100
    }
}