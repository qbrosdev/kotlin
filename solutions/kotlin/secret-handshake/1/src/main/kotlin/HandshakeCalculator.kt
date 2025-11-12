object HandshakeCalculator {

    val map = mapOf(
        Signal.WINK to 1,
        Signal.DOUBLE_BLINK to 2,
        Signal.CLOSE_YOUR_EYES to 4,
        Signal.JUMP to 8,
    )

    fun calculateHandshake(number: Int): List<Signal> {
        val list = map.entries
            .sortedBy { it.value }
            .filter { (it.value and number) != 0 }
            .map { it.key }

        return if (number and 16 != 0) list.reversed() else list
    }
}
