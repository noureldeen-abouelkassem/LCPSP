class Solution {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        val allowedSorted = allowed.toCharArray().sorted()
        return words.count {
            allowedSorted.containsAll(it.toSet().sorted())
    }
        }
}
"
