fun main() {
    val pecas = listOf(
        listOf(
            object : Peca() {
                override var tipo: String?  = null
                override var marca: String? = null
                override var modelo: String? = null

                override fun retirada() {

                }
            },
            object : Peca() {
                override var tipo: String? = null
                override var marca: String? = null
                override var modelo: String? = null

                override fun retirada() {

                }
            }
        ),
        listOf(
            object : Peca() {
                override var tipo: String? = null
                override var marca: String? = null
                override var modelo: String? = null

                override fun retirada() {

                }
            },
            object : Peca() {
                override var tipo: String? = null
                override var marca: String? = null
                override var modelo: String? = null

                override fun retirada() {

                }
            }
        )
    )

    pecas.forEach { lista ->
        println("Peças da lista ${pecas.indexOf(lista)}")
        lista.forEach { peca ->
            println("   Peça ${lista.indexOf(peca)}")
            peca.tipo = peca.solicitaTipo()
            peca.marca = peca.solicitaMarca()
            peca.modelo = peca.solicitaModelo()
        }
        if (lista == pecas.last())
            println("----------------------------------------\n")
        else
            println()
    }

    val guardaVolumes = GuardaVolumes(identificador = 12345)

    pecas.forEach {
        println("Identificador Peças ${pecas.indexOf(it)}: ${guardaVolumes.guardarPecas(listaPecas = it)}")
    }
    println()

    guardaVolumes.mostrarPecas
    println()

    print("Informe o identificador para visualizar as peças: ")
    val identificador = readLine()?.toInt()
    if (!guardaVolumes.mostrarPecas(identificador = identificador))
        println("Identificador não encontrado!")
    println()

    var i = 12345

    pecas.forEach {
        if (guardaVolumes.devolverPecas(identificador = i))
            println("Peças ${pecas.indexOf(it)} devolvidas com sucesso!")
        else
            println("Identificador não encontrado!")

        i++
    }
    println()

    guardaVolumes.mostrarPecas
}