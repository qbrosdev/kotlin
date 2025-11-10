import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(input: Any) {

    val date: LocalDateTime = when (input) {
        is LocalDateTime -> input.plusSeconds(1_000_000_000)
        is LocalDate -> input.atStartOfDay().plusSeconds(1_000_000_000)
        else -> throw IllegalArgumentException("Input must be LocalDate or LocalDateTime")
    }
}
