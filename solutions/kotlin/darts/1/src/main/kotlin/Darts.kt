import kotlin.math.sqrt
import kotlin.math.pow

object Darts {

    fun score(xn: Number, yn: Number): Int {
        val x = xn.toDouble()
        val y = yn.toDouble()
        
        val res = sqrt(x.pow(2.0) + y.pow(2.0))  // distance from origin
    
        return when {
            res <= 1 -> 10          // inner circle
            res > 1 && res <= 5 -> 5  // middle circle
            res > 5 && res <= 10 -> 1 // outer circle
            else -> 0               // miss
        }
    }
}
