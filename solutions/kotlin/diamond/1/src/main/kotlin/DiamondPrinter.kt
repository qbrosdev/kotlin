import kotlin.math.abs

class DiamondPrinter {

    fun printToList(ch: Char): List<String> {
        val res = mutableListOf<String>()
        val n = abs('A' - ch.uppercaseChar())
        val len = n * 2 + 1

        for (i in 1..len) {
            when {
                i == 1 || i == len -> {
                    CharArray(len) { ' ' }
                        .also { it[n] = 'A' }
                        .concatToString()
                        .also { res.add(it) }
                }

                i <= n + 1 -> {
                    val x = 'A' + (i - 1)   // fix character calculation
                    val left = n - (i - 1)  // correct left position
                    val right = n + (i - 1)  // correct right position
                    CharArray(len) { ' ' }
                        .also { it[left] = x; it[right] = x }
                        .concatToString()
                        .also { res.add(it) }
                }

                else -> {
                    val mirrorIndex = 2 * n + 2 - i  // mirror from top half
                    res.add(res[mirrorIndex - 1])
                }
            }
        }

        return res
    }
}
