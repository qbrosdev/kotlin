object ETL {
    fun transform(source: Map<Int, Collection<Char>>): Map<Char, Int> =
        source
            .flatMap { (score, letters) -> letters.map { it.lowercaseChar() to score } }
            .toMap()

    fun transform2(source: Map<Int, Collection<Char>>): Map<Char, Int> {
        val res = mutableMapOf<Char, Int>()
        source.entries
            .forEach{ it.value.forEach{ it2 -> res[it2.uppercaseChar()] = it.key } }
        return res
    }
}
