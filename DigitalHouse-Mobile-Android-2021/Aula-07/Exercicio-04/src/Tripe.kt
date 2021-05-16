class Tripe (
    var dobrado: Boolean,
    val alturaMaxima: Double,
    val alturaMinima: Double,
    var alturaAtual: Double
) {
    fun definirAltura(novaAltura: Double) {
        if (novaAltura in alturaMinima..alturaMaxima) {
            alturaAtual = novaAltura
        }
    }

    fun dobrar() {
        if (!dobrado)
            dobrado = true
    }

    fun desdobrar() {
        if (dobrado)
            dobrado = false
    }

    fun guardar() {
        dobrar()
        alturaAtual = alturaMinima
    }

    fun prontoParaGuardar(): Boolean {
        return dobrado && alturaAtual == alturaMinima
    }

    fun usar() {
        desdobrar()
        alturaAtual = (alturaMaxima /2) + (alturaMaxima / 4)
    }

    fun prontoParaUsar(): Boolean {
        return !dobrado && alturaAtual > alturaMaxima / 2
    }
}