import kotlin.random.Random
import kotlin.math.floor

class DndCharacter {

    // Roll all abilities at initialization
    val strength: Int = ability()
    val dexterity: Int = ability()
    val constitution: Int = ability()
    val intelligence: Int = ability()
    val wisdom: Int = ability()
    val charisma: Int = ability()

    // Calculate hitpoints based on constitution modifier
    val hitpoints: Int = 10 + modifier(constitution)

    // Roll 4 dice and return the sorted list
    fun rollDice(): List<Int> = List(4) { Random.nextInt(1, 7) }

    companion object {

        // Generate a single ability score: sum of top 3 of 4 dice
        fun ability(): Int {
            val rolls = List(4) { Random.nextInt(1, 7) }
            return rolls.sortedDescending().take(3).sum()
        }

        // Calculate ability modifier: floor((score - 10) / 2)
        fun modifier(score: Int): Int {
            return floor((score - 10) / 2.0).toInt()
        }
    }
}
