class Impressora (
    val listaImprimivel: MutableList<Imprimivel>
) {
    fun adicionaListaImprimivel(documento: Imprimivel) {
        listaImprimivel.add(documento)
    }

    fun imprimiListaImprimivel() {
        listaImprimivel.forEach {
            print("Elemento ${listaImprimivel.indexOf(it)}: ")
            it.imprimir()
        }
    }
}