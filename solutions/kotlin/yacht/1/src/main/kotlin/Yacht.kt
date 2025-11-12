object Yacht {

    fun solve(category: YachtCategory, vararg dices: Int): Int {
        val diceList = dices.toList()
    
        return when (category) {
            YachtCategory.ONES   -> diceList.count { it == 1 } * 1
            YachtCategory.TWOS   -> diceList.count { it == 2 } * 2
            YachtCategory.THREES -> diceList.count { it == 3 } * 3
            YachtCategory.FOURS  -> diceList.count { it == 4 } * 4
            YachtCategory.FIVES  -> diceList.count { it == 5 } * 5
            YachtCategory.SIXES  -> diceList.count { it == 6 } * 6
    
            YachtCategory.FULL_HOUSE -> {
                val freq = diceList.groupingBy { it }.eachCount()
                if (freq.size == 2 && freq.values.sorted() == listOf(2, 3)) {
                    diceList.sum()   // valid full house → total of all dice
                } else 0
            }
    
            YachtCategory.FOUR_OF_A_KIND -> {
                val freq = diceList.groupingBy { it }.eachCount()
                val (num, count) = freq.entries.find { it.value >= 4 } ?: return 0
                num * 4
            }
    
            YachtCategory.LITTLE_STRAIGHT ->
                if (diceList.sorted() == listOf(1, 2, 3, 4, 5)) 30 else 0
    
            YachtCategory.BIG_STRAIGHT ->
                if (diceList.sorted() == listOf(2, 3, 4, 5, 6)) 30 else 0
    
            YachtCategory.CHOICE -> diceList.sum()
    
            YachtCategory.YACHT -> if (diceList.distinct().size == 1) 50 else 0
        }
    }
}
