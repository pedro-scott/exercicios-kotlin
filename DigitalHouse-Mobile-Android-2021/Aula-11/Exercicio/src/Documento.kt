class Documento : Imprimivel {
    override val nome = "Documento"
    override val tipoDocumento = "Word"

    override fun imprimir() {
        println("Eu sou um $nome $tipoDocumento")
    }
}