class CamaroteInferior (
    override val valor: Double,
    val localizacaoIngresso: String
) : VIP() {
    override val adicional = 0.0

    override fun imprimeValor() {
        println("Valor R$$valor")
    }

    override fun imprimeTipoIngresso() {
        println("Ingresso VIP Camarote Inferior")
    }

    fun imprimeLocalizacaoIngresso() {
        println("Localização do Ingresso: $localizacaoIngresso")
    }
}