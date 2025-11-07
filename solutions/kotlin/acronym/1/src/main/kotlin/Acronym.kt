object Acronym {
    fun generate(phrase: String?) : String {
        if (phrase.isNullOrBlank()) return ""
        return phrase
            .split(Regex("[-\\s]"))
            .mapNotNull { item -> item.firstOrNull { it.isLetter() }?.uppercaseChar() }
            .joinToString("")
    }
}
