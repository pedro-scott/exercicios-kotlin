class Normal: Ingresso() {
    override val valor = 14.99

    override fun imprimeValor() {
        println("Valor R$$valor")
    }

    override fun imprimeTipoIngresso() {
        println("Ingresso Normal")
    }
}