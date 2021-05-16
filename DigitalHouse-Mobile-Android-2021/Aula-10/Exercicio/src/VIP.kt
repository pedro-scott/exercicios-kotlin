open class VIP: Ingresso() {
    override val valor = 29.99
    val adicional = 14.99

    override fun imprimeValor() {
        println("Valor R$$valor")
    }

    override fun imprimeTipoIngresso() {
        println("Ingresso VIP")
    }
}