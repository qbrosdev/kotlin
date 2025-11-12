object Series {

    fun slices(n: Int, st: String): List<List<Int>> {
        require(n > 0)
        require(n <= st.length)

        var s = 0
        var e = s + n-1
        val res = mutableListOf<List<Int>>()

        do {
            res.add((s..e).map { st[it].digitToInt() })
            s++
            e = s + n-1
        } while (e <= st.lastIndex)

        return res
    }
}
