
val codonMap= mapOf(
    "AUG" to "Methionine",
    "UUU" to "Phenylalanine",
    "UUC" to "Phenylalanine",
    "UUA" to "Leucine",
    "UUG" to "Leucine",
    "UCU" to "Serine",
    "UCC" to "Serine",
    "UCA" to "Serine",
    "UCG" to "Serine",
    "UAU" to "Tyrosine",
    "UAC" to "Tyrosine",
    "UGU" to "Cysteine",
    "UGC" to "Cysteine",
    "UGG" to "Tryptophan",
    "UAA" to "STOP",
    "UAG" to "STOP",
    "UGA" to "STOP"
)


fun translate(rna: String?): List<String> {
    if (rna.isNullOrBlank()) return emptyList()

    return rna.uppercase()
        .chunked(3)
        .asSequence()
        .map { codonMap[it] ?: throw IllegalArgumentException() }
        .takeWhile { it != "STOP" }
        .toList()
}

