class Series(val str: String) {

    init {
        require(str.all { it.isDigit() })
    }

    fun getLargestProduct(span: Int): Long {

        require(0 < span && span <= str.length)

        var l = 0
        var r = l + span - 1
        var max = 0L

        while (r <= str.lastIndex) {
            val cur =
                str.substring(l, r + 1).fold(1L) { acc, it -> it.digitToInt() * acc }

            max = if (cur > max) cur else max
            l++; r++;
        }

        return max
    }
}
