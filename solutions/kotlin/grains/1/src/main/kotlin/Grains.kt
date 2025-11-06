import java.math.BigInteger

object Board {

    fun getGrainCountForSquare(number: Int): BigInteger {
        if(number<= 0 || number >= 64) throw IllegalArgumentException()
        return BigInteger.valueOf(2).pow(number - 1)
    }
    
    fun getTotalGrainCount(): BigInteger {

        var res = BigInteger.ZERO
    
        for (i in 1..63) {
            res = res.add(getGrainCountForSquare(i))
        }
        return res
    }
}
