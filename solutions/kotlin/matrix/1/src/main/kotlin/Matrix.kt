class Matrix(private val matrixAsString: String) {

    val rows: List<List<Int>> = matrixAsString
        .split("\n")
        .map { it.split(" ").map { n -> n.toInt() } }

    fun column(colNr: Int): List<Int> = rows.map { it[colNr-1] }

    fun row(rowNr: Int): List<Int> = rows[rowNr-1]
}
