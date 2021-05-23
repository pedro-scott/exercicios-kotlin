abstract class ContaBancaria : Imprimivel {
    abstract var saldo: Double
        protected set
    abstract val numeroConta: Int

    abstract fun sacar(valor: Double) : Boolean
    abstract fun depositar(valor: Double) : Boolean

    fun tranferir(valor: Double, destinatario: ContaBancaria) : Boolean = when {
        sacar(valor = valor) -> {
            destinatario.depositar(valor = valor)
            true
        }
        else -> false
    }
}