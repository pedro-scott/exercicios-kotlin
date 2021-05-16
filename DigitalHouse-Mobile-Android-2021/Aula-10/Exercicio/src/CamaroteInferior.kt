class CamaroteInferior (val localizacaoIngresso: String): VIP() {
    fun imprimeLocalizacaoIngresso() {
        println("Localização do Ingresso: $localizacaoIngresso")
    }

    override fun imprimeTipoIngresso() {
        println("Ingresso VIP Camarote Inferior")
    }
}