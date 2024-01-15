        val keyChars = key.filter { it != ' ' }.toCharArray()
        val resultSet = LinkedHashSet<Char>()
        for (i in keyChars.indices) {
            resultSet.add(keyChars[i])
        }
        val mapOfChars = mutableListOf<Pair<Char, Char>>()
        var outerLoop = 0
        for (item in resultSet) {
            mapOfChars.add(Pair(item, alphabetics[outerLoop]))
            outerLoop++
            if (outerLoop >= 26) {
                outerLoop = 0
            }
        }
        for (char in message) {
        val alphabetics = ('a'..'z').toList()
        var result = ""
    fun decodeMessage(key: String, message: String): String {
class Solution {
"
