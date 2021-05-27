package br.com.digitalhouse.aula15

class Contrato(override val nome: String) : Imprimivel {
    override val tipoDocumento = "Contrato"

    override fun imprimir() = println("Eu sou um(a) $tipoDocumento $nome")
}