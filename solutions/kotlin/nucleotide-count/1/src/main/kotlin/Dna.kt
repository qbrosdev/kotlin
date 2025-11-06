class Dna(val input:String) {

    private val set = setOf('A','C','T','G')
    init {
        require(input.all { set.contains(it) }) { "Invalid" }
        // require(...) is the idiomatic Kotlin way to check preconditions 
        // and throw IllegalArgumentException if violated.
    }

    val nucleotideCounts: Map<Char, Int>
        get() {
            return set.associateWith { item -> input.count { it == item } }
            // Goes through the string input (character by character)
            //Counts how many times the condition inside { ... } is true
        }
}
