package br.com.digitalhouse.aula15

class Foto(override val nome: String) : Imprimivel {
    override val tipoDocumento = "Foto"

    override fun imprimir() = println("Eu sou um(a) $tipoDocumento $nome")
}