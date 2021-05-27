package br.com.digitalhouse.aula15

fun main() {
    val imprimiveis = mutableListOf<Imprimivel>(
        Documento(nome = "Word"),
        Foto(nome = "Selfie"),
        Contrato(nome = "Muito Legal"),
        Documento(nome = "Excel"),
        Foto(nome = "3x4"),
        Contrato(nome = "Muito chato")
    )

    val impressora = Impressora()

    imprimiveis.forEach {
        impressora.adicionaLista(it)
        println(it.whoIs())
    }
    println()

    impressora.imprimeLista()
}

fun Impressora.adicionaLista(imprimivel: Imprimivel) = this.listaImprimivel.add(imprimivel)

fun Impressora.imprimeLista() = this.listaImprimivel.forEach { it.imprimir() }

fun Imprimivel.whoIs() : String  = "${this.tipoDocumento} - Implementa Imprimivel"

//val Imprimivel.whoIs : String get() = "$tipoDocumento - Implementa Imprimivel"