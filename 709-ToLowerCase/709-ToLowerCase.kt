    fun toLowerCase(s: String): String {
        var result = ""
        val map = hashMapOf<Char, Char>()
        val upperAlphabetics = ('A'..'Z').toList()
        val lowerAlphabetics = ('a'..'z').toList()
        upperAlphabetics.forEachIndexed { index, c ->
            map[c] = lowerAlphabetics[index]
        }
        s.forEach {
            result += map[it] ?: it
        }
        return result
    }
}
"
