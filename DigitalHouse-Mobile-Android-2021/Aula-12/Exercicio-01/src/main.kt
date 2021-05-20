fun main() {
    val pessoas = listOf(
        Pessoa(
            nome = "Joao",
            rg = 111
        ),
        Pessoa(
            nome = "Alan",
            rg = 111
        )
    )

    if (pessoas[0] == pessoas[1])
        println("São Iguais")
    else
        println("São Diferentes")
}