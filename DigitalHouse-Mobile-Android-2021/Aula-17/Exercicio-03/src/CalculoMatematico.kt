class CalculoMatematico {
//    fun divisao(x: Int, y: Int) : Int =
//        try {
//            x / y
//        } catch (e: ArithmeticException) {
//            println(e.stackTraceToString())
//            0
//        }

    @Throws(ArithmeticException::class)
    fun divisao(x: Int, y: Int) : Int {
        if (y == 0) throw ArithmeticException("Divisão por Zero!")
        else return x / y
    }
}