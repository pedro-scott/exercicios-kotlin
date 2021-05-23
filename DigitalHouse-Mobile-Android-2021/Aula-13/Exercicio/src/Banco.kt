class Banco(val listaContas: MutableList<ContaBancaria>) : Imprimivel {
    fun inserir(conta: ContaBancaria) { listaContas.add(conta) }

    fun remover(conta: ContaBancaria) { listaContas.remove(conta) }

    fun procurarConta(numeroConta: Int) : ContaBancaria? = listaContas.find { it.numeroConta == numeroConta }

    override fun mostraDados() {
        if (listaContas.size == 0)
            println("Lista do Banco Vazia!")
        else {
            listaContas.forEach {
                it.mostraDados()

                if (it != listaContas.last())
                    println()
            }
        }
    }
}