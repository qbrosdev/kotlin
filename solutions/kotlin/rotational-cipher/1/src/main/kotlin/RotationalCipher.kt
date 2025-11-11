class RotationalCipher(private val rot: Int) {

    fun encode(text: String): String {
        return text.map {
            when {
                it.isUpperCase() -> rotate(it, 'A').toChar()
                it.isLowerCase() -> rotate(it, 'a').toChar()
                else -> it
            }
        }.joinToString("")
    }

    private fun rotate(key: Char, base: Char): Int {
       return ((key - base + rot) % 26) + base.code
    }
}
