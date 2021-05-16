fun main() {
    //Criando lista de Itens
    val itens = mutableListOf(
        Item(numero = 1, descricao = "mousepad", quantidade = 5, preco = 10.0),
        Item(numero = 2, descricao = "mouse", quantidade = 10, preco = 50.0),
        Item(numero = 3, descricao = "placa de video", quantidade = 1, preco = 1899.99)
    )

    //Criando fatura
    val fatura = Fatura(lista = itens)

    //Imprimindo valor total
    println("Valor total da fatura é de R$${fatura.getTotalFatura()}")
}