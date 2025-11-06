object CollatzCalculator {
val cache = mutableMapOf<Int, Int>()

fun computeStepCount(start: Int): Int {
    var current = start
    var steps = 0
    val sequence = mutableListOf<Int>()

    while (current != 1) {
        // Check cache first
        if (cache.containsKey(current)) {
            steps += cache[current]!!
            break
        }
        sequence.add(current)
        current = if (current % 2 == 0) current shr 1 else current * 3 + 1
        steps++
    }

    // Store computed steps in cache
    var stepCount = steps
    for (num in sequence) {
        cache[num] = stepCount
        stepCount--
    }

    return steps
}
}
