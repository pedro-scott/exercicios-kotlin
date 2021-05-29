class GuardaVolumes(
    private var identificador: Int = 0
) {
    private val pertences = mutableMapOf<Int, List<Peca>>()

    fun guardarPecas(listaPecas: List<Peca>): Int {
        pertences[identificador] = listaPecas
        identificador++

        return identificador - 1
    }

    val mostrarPecas: Unit get() {
        if (pertences.isEmpty()) {
            println("Guarda Volume Vazio!")
            return
        }

        pertences.forEach { entry ->
            println("Chave: ${entry.key}")
            entry.value.forEach {
                println("   Tipo: ${it.tipo}, Marca: ${it.marca}, Modelo: ${it.modelo}")
            }
        }
    }

    fun mostrarPecas(identificador: Int?) : Boolean =
        when (pertences[identificador]) {
            null -> false
            else -> {
                println("Chave: $identificador")
                pertences[identificador]?.forEach {
                    println("   Tipo: ${it.tipo}, Marca: ${it.marca}, Modelo: ${it.modelo}")
                }
                true
            }
        }

    fun devolverPecas(identificador: Int) : Boolean =
        when (pertences.remove(key = identificador)) {
            null -> false
            else -> true
        }
}