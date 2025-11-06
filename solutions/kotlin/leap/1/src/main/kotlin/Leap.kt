data class Year(val input: Int) {

    // TODO: Implement proper constructor


    val isLeap: Boolean =
        if (input%4 != 0) false
        else if(input%100 == 0) {
            input%400 == 0
        }  else true
}
