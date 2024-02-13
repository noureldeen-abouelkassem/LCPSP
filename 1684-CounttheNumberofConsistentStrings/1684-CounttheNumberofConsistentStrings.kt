class Solution {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        return words.count {
            it.toCharArray().subtract(allowed.toCharArray().toList().toSet()).isEmpty()
        }
    }
}
"
