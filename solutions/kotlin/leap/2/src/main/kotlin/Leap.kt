data class Year(val input: Int) {

    // TODO: Implement proper constructor


    val isLeap: Boolean = (input%4 == 0 && input%100 !=0) || (input % 400 == 0)
}
