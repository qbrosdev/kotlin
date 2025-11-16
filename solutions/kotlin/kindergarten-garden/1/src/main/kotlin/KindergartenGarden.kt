class KindergartenGarden(private val diagram: String) {

    val map = mapOf(
        'G' to "grass",
        'C' to "clover",
        'R' to "radishes",
        'V' to "violets"
    )
        
    val sills: List<String> = diagram.split("\n")

    val _class = listOf(
        "alice", "bob", "charlie", "david", "eve", "fred",
        "ginny", "harriet", "ileana", "joseph", "kincaid", "larry"
    )

    fun getPlantsOfStudent(student: String): List<String> {

        val i = _class.indexOf(student.lowercase())
        require(i >= 0)

        val start = i * 2

        val res = mutableListOf<String>()
        sills.forEach {
            res.add(map[it[start]] ?: throw IllegalArgumentException())
            res.add(map[it[start + 1]] ?: throw IllegalArgumentException())
        }

        return res
    }
}
