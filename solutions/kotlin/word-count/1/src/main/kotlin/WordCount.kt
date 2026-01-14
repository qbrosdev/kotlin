object WordCount {

    fun phrase(phrase: String): Map<String, Int> {
        return phrase
            .trim()
            .lowercase()
            .replace(Regex("[\\p{Punct}&&[^']]+"), " ")
            .split(Regex("\\s+"))
            .filter { it.isNotEmpty() }
            .map { it.trim('\'') }  
            .groupingBy { it }
            .eachCount()
    }
}
