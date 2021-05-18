fun main() {
    //Instanciando classes de documentos dentro de uma lista
    val listaDocumentos = mutableListOf(
        Foto(),
        Documento(),
        Contrato()
    )

    //Instanciando Impressora
    val impressao = Impressora(listaImprimivel = mutableListOf())

    //Adicionando documentos na fila de impressão atráves do método da classe
    listaDocumentos.forEach {
        impressao.adicionaListaImprimivel(it)
    }

    //Imprimindo a lista de impressão através do método da classe
    impressao.imprimiListaImprimivel()
}