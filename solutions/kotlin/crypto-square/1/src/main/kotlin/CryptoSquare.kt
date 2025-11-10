import kotlin.math.sqrt

object CryptoSquare {

    fun ciphertext(plainText: String): String {

       if(plainText.isEmpty()) return ""
       val normalized = plainText.lowercase()
            .filter{it.isLetterOrDigit()}
       val (row,col) = getDim(normalized) 
       val standard = normalized
            .chunked(col)
            .map{it.padEnd(col, ' ')}
       
        return cipher(standard, col)     
    }

    fun getDim(input:String):Pair<Int,Int>{
        val len = input.length
        val x = sqrt(len.toDouble()).toInt()
        return when(x*x){
            len -> Pair(x, x)
            else -> Pair(x, x+1)
        }
    }

    fun cipher(rows: List<String>, cols: Int): String =
        (0 until cols).joinToString(" ") { col ->
            rows.map { it[col] }.joinToString("")
        }

}
