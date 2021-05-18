class Foto : Imprimivel {
    override val nome = "Foto"
    override val tipoDocumento = "Selfie"

    override fun imprimir() {
        println("Eu sou uma $tipoDocumento")
    }
}