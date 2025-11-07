
fun twofer(name: String?=null): String {
    return name
        ?.let { "One for $it, one for me." }
        ?: "One for you, one for me."
}
