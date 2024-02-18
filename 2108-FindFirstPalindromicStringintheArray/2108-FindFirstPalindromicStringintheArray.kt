class Solution {
    fun firstPalindrome(words: Array<String>): String =  words.firstOrNull { it.reversed() == it } ?: ""
}
[
