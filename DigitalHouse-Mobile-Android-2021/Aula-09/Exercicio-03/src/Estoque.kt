class Estoque (
    var nome: String,
    var qtdAtual: UInt,
    var qtdMinima: UInt
) {

//    init {
//        if (qtdAtual < 0)
//            qtdAtual = 0
//
//        if (qtdMinima < 0)
//            qtdMinima = 0
//    }

    fun mudarNome(novoNome: String) {
        nome = novoNome
    }

    fun mudarQtdMinima(novaQtdMinima: UInt) {
        qtdMinima = novaQtdMinima
    }

    fun repor(qtd: UInt) {
        qtdAtual += qtd
    }

    fun darBaixa(qtd: UInt) {
        qtdAtual -= qtd
    }

    fun mostra(): String {
        return "Produto: $nome, Quantidade Atual: $qtdAtual, Quantidade Mínima: $qtdMinima"
    }

    fun precisaRepor(): Boolean {
        return qtdAtual <= qtdMinima
    }
}