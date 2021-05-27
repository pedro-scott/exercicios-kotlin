package br.com.digitalhouse.aula15

class Documento(override val nome: String) : Imprimivel {
    override val tipoDocumento = "Documento"

    override fun imprimir() = println("Eu sou um(a) $tipoDocumento $nome")
}