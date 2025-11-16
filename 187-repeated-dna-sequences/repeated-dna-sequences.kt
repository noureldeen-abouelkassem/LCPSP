class Solution {
    fun findRepeatedDnaSequences(s: String): List<String> {
        if (s.isEmpty()) return listOf()
        if (s.length <= 10) return listOf()
        val map = hashMapOf<String, Int>()
        val chars = mutableListOf<Char>()
        for (c in 0 until 10) {
            chars.add(s[c])
        }
        map[convertCurrentCharsToString(chars)] = 1
        for (windowEnd in 10 until s.length) {
            chars.add(s[windowEnd])
            chars.removeAt(0)
            val currentString = convertCurrentCharsToString(chars)
            map[currentString] = map.getOrDefault(currentString, 0) + 1
        }
        return map.filter { (key, value) -> value >= 2 }.keys.toList()
    }

    private fun convertCurrentCharsToString(chars: List<Char>): String {
        return chars.joinToString("")
    }
}