object RunLengthEncoding {

    fun encode(input: String): String = buildString {
        var count = 1
        input.zip(input.drop(1) + '\u0000').forEach { (curr, next) ->
            if (curr == next) count++
            else {
                if (count > 1) append(count)
                append(curr)
                count = 1
            }
        }
    }

    fun decod2(input: String): String = buildString {
        var count = 0
        input.forEach { ch ->
            when {
                ch.isDigit() -> count = count * 10 + ch.digitToInt()
                else -> {
                    val repeatCount = if (count == 0) 1 else count
                    repeat(repeatCount) { append(ch) } // ch is unambiguous
                    count = 0
                }
            }
        }
    }

    fun decode(input: String): String {
        var count = 0
        return buildString {
            input.forEach {  ch ->
                if (ch.isDigit()) {
                    count = count * 10 + ch.digitToInt()
                } else {
                    if (count != 0) {
                        repeat(count) { append(ch) }
                        count = 0
                    } else append(ch)
                }
            }
        }
    }
}
