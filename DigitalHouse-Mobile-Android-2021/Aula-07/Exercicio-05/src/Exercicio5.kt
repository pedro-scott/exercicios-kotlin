fun main() {
    //Criando lista com carros
    val carros = mutableListOf(
        Veiculo(marca = "Audi", modelo = "R8", cor = "Vermelho", anoFabricacao = 2021, quilometragem = 100.0),
        Veiculo(marca = "Audi", modelo = "RS4", anoFabricacao = 2021, cor = "Branco", quilometragem = 500.0)
    )

    //Criando lista com clientes
    val clientes = mutableListOf(
        Cliente(nome = "Pedro", sobrenome = "Scott", contato = "pedro@gmail.com"),
        Cliente(nome = "Victor", sobrenome = "Scott", contato = "(61) 90000-2222")
    )

    //Criando concessionaria
    val audiCenter = Concessionaria()

    //Variável auxiliar
    var valorCarros = 1000000.0

    //Registrando vendas
    clientes.forEach {
        audiCenter.registrarVenda(cliente = it, carro = carros[clientes.indexOf(it)], valor = 1000000.0)
        valorCarros -= 500000
    }

    //Mostrando vendas registradas
    audiCenter.vendas.forEach {
        print("Venda Nº ${audiCenter.vendas.indexOf(it)}\n")
        print("Carro: ${it.veiculo.marca} ${it.veiculo.modelo}\n")
        print("Cliente: ${it.cliente.nome} ${it.cliente.sobrenome}\n")
        print("Valor da Venda: R$${it.valorVenda}\n\n")
    }
}