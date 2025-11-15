class School {

    private val school = mutableMapOf<Int, MutableSet<String>>()

    fun add(student: String, grade: Int) {
        val set = school.getOrPut(grade){mutableSetOf<String>()}
        if(!set.add(student)) throw IllegalArgumentException()
    }

    fun grade(grade: Int): List<String> =
        school
            .getOrDefault(grade, emptySet())
            .sorted()
            .toList()

    fun roster(): List<String> =
        school
            .toSortedMap()
            .values
            .flatMap{it.sorted()}

}
