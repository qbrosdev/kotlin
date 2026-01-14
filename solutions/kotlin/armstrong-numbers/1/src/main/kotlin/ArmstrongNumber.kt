import kotlin.math.pow

object ArmstrongNumber {

    fun check(input: Int): Boolean {
        val digits = input
            .toString()
            .map { it.digitToInt() }
    
        val pow = digits.size
    
        fun Int.pow(n: Int): Int {
            var result = 1
            repeat(n) { result *= this }
            return result
        }
    
        return input == digits.sumOf { it.pow(pow) }
    }

}
