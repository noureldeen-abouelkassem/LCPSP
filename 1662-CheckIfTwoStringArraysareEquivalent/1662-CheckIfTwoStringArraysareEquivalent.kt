class Solution {
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
        var str1 = String()
        var str2 = String()
        word1.forEach {
            str1 += it
        }
        word2.forEach {
            str2 += it
        }
        return str1 == str2
    }
}
