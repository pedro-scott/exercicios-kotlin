class Normal (
    override val valor:Double
) : Ingresso() {
    override fun imprimeValor() {
        println("Valor R$$valor")
    }

    override fun imprimeTipoIngresso() {
        println("Ingresso Normal")
    }
}