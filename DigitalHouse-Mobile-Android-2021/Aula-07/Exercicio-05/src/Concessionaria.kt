class Concessionaria {
    var vendas = mutableListOf<Venda>()

    fun registrarVenda(carro: Veiculo, cliente: Cliente, valor:Double) {
        val venda = Venda(veiculo = carro, cliente = cliente, valorVenda = valor)
        vendas.add(venda)
    }
}