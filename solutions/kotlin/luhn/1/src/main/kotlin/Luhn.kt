object Luhn {

    fun isValid(candidate: String): Boolean {

        if (candidate.any { !it.isDigit() && !it.isWhitespace() }) return false
        
        val normalized = candidate.filter { it.isDigit() }.reversed()
        if (normalized.length <= 1) return false
        
        return (
                normalized
                    .mapIndexed { i, it ->
                        if (i % 2 == 1) {
                            val res = it.digitToInt() * 2
                            if (res > 9) res - 9 else res
                        } else it.digitToInt()
                    }
                    .sum() % 10 == 0)
    }
}
