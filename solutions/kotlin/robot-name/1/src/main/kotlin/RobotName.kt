import kotlin.random.Random

class Robot {

    private var _name: String? = null

    val name: String
        get() = if (!_name.isNullOrBlank()) _name!! else generateName().also { _name = it }

    fun reset()  = set.remove(_name).also{_name = null}

    companion object {

        private val set = mutableSetOf<String>()

        private fun generateName(): String {

            var rand: String

            do {
                rand = buildString {
                    repeat(2) { append(('A'..'Z').random()) }
                    repeat(3) { append(Random.nextInt(0, 10)) }
                }

            } while (!set.add(rand))

            return rand
        }
    }
}
