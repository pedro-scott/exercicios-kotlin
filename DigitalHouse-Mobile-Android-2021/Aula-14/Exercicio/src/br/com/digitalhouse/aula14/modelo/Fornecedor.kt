package br.com.digitalhouse.aula14.modelo

class Fornecedor (val produtos: MutableList<Produto?> = mutableListOf()) {
    fun entrar(
        solicitaDesc: () -> String?,
        solicitaPreco: () -> Double?
    ) { produtos.add(Produto(descricao = solicitaDesc(), preco = solicitaPreco())) }

    val listarProdutos: Unit get() = produtos.forEach { println(it ?: println("Não Informado!")) }

    val menu: Int? get() {
        println("Olá, o que deseja fazer hoje?")
        println("1 - Entrar com um produto")
        println("2 - Listar os produtos disponíveis")
        println("3 - Sair")
        print("Escolha uma opção: ")
        return readLine()?.toInt()
    }
}