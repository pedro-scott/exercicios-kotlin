class CamaroteSuperior (
    override val valor: Double,
    override val adicional: Double
) : VIP() {
    override fun imprimeValor() {
        println("Valor R$${valor + adicional}")
    }

    override fun imprimeTipoIngresso() {
        println("Ingresso VIP Camarote Superior")
    }
}