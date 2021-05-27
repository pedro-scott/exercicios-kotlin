package br.com.digitalhouse.aula14.modelo

data class Produto(
    val descricao: String?,
    val preco: Double?
) {
    override fun toString(): String = "Produto: ${descricao ?: "Não informado"}, Preço: R$${preco ?: "Não Informado"}"
}
