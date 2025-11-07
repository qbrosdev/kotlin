class Triangle<out T : Number>(vararg item: T) {
    val list = mutableListOf<Double>()

    init {
        list.addAll(item.map { it.toDouble() })
        require(list.size == 3) { "3 sides" }
        require(list.all { it > 0.0 }) { "All side have to be positive" }
        require(list.sorted().let { it[0] + it[1] >= it[2] }) { "Triangle condition" }
    }

    val isEquilateral: Boolean = list.distinct().size == 1
    val isIsosceles: Boolean = list.distinct().size <= 2
    val isScalene: Boolean = list.distinct().size == 3
}
