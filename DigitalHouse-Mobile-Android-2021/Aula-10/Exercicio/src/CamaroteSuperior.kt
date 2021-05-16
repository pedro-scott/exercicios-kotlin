class CamaroteSuperior: VIP() {
    override fun imprimeValor() {
        println("Valor R$${valor + adicional}")
    }

    override fun imprimeTipoIngresso() {
        println("Ingresso VIP Camarote Superior")
    }
}