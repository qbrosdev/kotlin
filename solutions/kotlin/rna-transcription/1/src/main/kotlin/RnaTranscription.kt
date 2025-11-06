val map = mapOf(
    'G' to 'C',
    'C' to 'G',
    'T' to 'A',
    'A' to 'U'
)

fun transcribeToRna(dna: String): String =
    dna.map { map[it] ?: throw IllegalArgumentException("Invalid DNA") }
        .joinToString("")  // concatenate chars into a string

fun transcribeToRna2(dna: String): String = buildString {
    dna.forEach {
        append(map[it] ?: throw IllegalArgumentException("Invalid DNA")) 
    }
}
