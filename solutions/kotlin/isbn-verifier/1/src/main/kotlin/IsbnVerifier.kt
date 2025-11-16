class IsbnVerifier {

    private val reg = Regex("^[0-9]{9}[0-9X]$")
    fun isValid(number: String): Boolean {
        val normalized = number.uppercase().filter { it != '-' }
        if (!normalized.matches(reg)) return false

       return normalized
            .mapIndexed { i, ch ->
                val mul = if (ch == 'X') 10 else ch.digitToInt()
                mul * (10 - i)
            }
            .sum() % 11 == 0
    }
}
