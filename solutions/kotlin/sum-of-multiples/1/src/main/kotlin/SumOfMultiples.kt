object SumOfMultiples {

    fun sum(factors: Set<Int>, limit: Int): Int {
        val res = mutableSetOf<Int>()
        factors
            .filter{ it > 0}
            .forEach {
            for (i in it until limit step it) res.add(i)
        }
    
        return res.sum()
    }

}
