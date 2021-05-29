fun main(){
    val loteriaSonhos = mapOf(
        0 to "Ovos",
        1 to "Água",
        2 to "Escopeta",
        3 to "Cavalo",
        4 to "Dentista",
        5 to "Fogo"
    )

    val textoLoteria = StringBuilder()

    loteriaSonhos.forEach {
        textoLoteria.append("${it.key} - ${it.value}")
        if (it.key != 5) textoLoteria.appendLine()
    }
    println("$textoLoteria\n")

    val apelidos = mapOf(
        "Jõao" to "Juan, Fissura, Maromba",
        "Miguel" to "Night Watch, Bruce Wayne, Tampinha",
        "Maria" to "Wonder Woman, Mary, Marilene",
        "Lucas" to "Lukinha, Jorge, George"
    )

    val textoApelidos = StringBuilder()

    apelidos.forEach {
        textoApelidos.append("${it.key} - ${it.value}")
        if (it.key != "Lucas") textoApelidos.appendLine()
    }
    println(textoApelidos)
}