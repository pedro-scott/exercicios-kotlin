import java.lang.ArithmeticException

fun main() {
    val teste = CalculoMatematico()

    try {
        teste.divisao(x = 4, y = 0)
    } catch (e: ArithmeticException) { println(e.message) }
}