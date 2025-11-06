object Bob {
    fun hey(input: String): String {
        val msg = input.trim()
        val letters = msg.filter { it.isLetter() }
        val isYelling = letters.isNotEmpty() && letters.all { it.isUpperCase() }
        val isQuestion = msg.endsWith("?")
    
        return when {
            msg.isBlank() -> "Fine. Be that way!"
            isYelling && isQuestion -> "Calm down, I know what I'm doing!"
            isYelling -> "Whoa, chill out!"
            isQuestion -> "Sure."
            else -> "Whatever."
        }
    }      
    
}
