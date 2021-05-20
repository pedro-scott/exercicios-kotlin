fun main() {
    val cocas = listOf(
        Coca(
            tamanho = 111,
            preco = 1.23
        ),
        Coca(
            tamanho = 111,
            preco = 2.34
        )
    )

    if (cocas[0] == cocas[1])
        println("São Iguais")
    else
        println("São Diferentes")
}