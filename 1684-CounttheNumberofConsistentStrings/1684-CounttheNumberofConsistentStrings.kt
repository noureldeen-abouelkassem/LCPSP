class Solution {
        fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        val allowedSorted = allowed.toCharArray().sorted()
        return words.map { it.toSet() }.map { it.sorted() }.count { allowedSorted.containsAll(it) }

    }
}
"
