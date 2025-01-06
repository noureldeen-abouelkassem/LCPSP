class Solution {
    fun numOfStrings(patterns: Array<String>, word: String): Int {
        return patterns.count { word == it || word.contains(it) }
    }
}