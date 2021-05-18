class Contrato : Imprimivel {
    override val nome = "Contrato"
    override val tipoDocumento = "Muito Legal"

    override fun imprimir() {
        println("Eu sou um $nome $tipoDocumento")
    }
}