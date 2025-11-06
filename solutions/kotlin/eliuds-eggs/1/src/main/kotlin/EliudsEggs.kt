object EliudsEggs {

    fun eggCount(number: Int): Int{
        var current = number
        val res = StringBuilder()
    
        while(current != 0){
            res.append(current%2)
            current /= 2
        }
    
        return res.toString().reversed().count { it == '1' }
    }
}
