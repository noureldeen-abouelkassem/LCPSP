class Solution {
    fun firstPalindrome(words: Array<String>): String = words.firstOrNull { w ->
        (0..w.length / 2).all { w[it] == w[w.lastIndex - it] }
      } ?: ""
}
[
