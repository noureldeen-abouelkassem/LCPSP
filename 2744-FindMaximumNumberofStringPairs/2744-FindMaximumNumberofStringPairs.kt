class Solution {
    fun maximumNumberOfStringPairs(words: Array<String>): Int {
        return words.groupingBy { it.toSortedSet() }.eachCount().count { it.value > 1 }
    }
}
[
