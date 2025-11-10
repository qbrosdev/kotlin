class Squares(val num:Int) {

    init{
        require(num > 0)
    }

    fun sumOfSquares():Int = (1..num).sumOf { it * it }

    fun squareOfSum():Int = (1..num).sum().let { it * it }

    fun difference() = squareOfSum() - sumOfSquares()
}
