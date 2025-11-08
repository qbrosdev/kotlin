object BinarySearch {
    
    fun search(list: List<Int>, item: Int): Int {
    
        if (list.isEmpty()) throw NoSuchElementException()
        var l = 0
        var r = list.lastIndex
        while (l <= r) {
            var m = (l + r) / 2
            when {
                list[m] == item -> return m
                list[m] < item  -> l = m + 1
                else            ->  r = m - 1  
            }
        }
        throw NoSuchElementException()
    }
}
