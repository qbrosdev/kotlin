fun String.signature(): Map<Char, Int> =
    this.lowercase().groupingBy { it }.eachCount()


class Anagram(val word: String) {

    val normalized = word.lowercase()

    fun match(anagrams: Collection<String>): Set<String> {

        fun isAnagram(input: String): Boolean = input.lowercase() != normalized
                && normalized.signature() == input.signature()

        return anagrams
            .filter { isAnagram(it) }
            .toSet()
    }
}
