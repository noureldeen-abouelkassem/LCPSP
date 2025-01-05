class Solution {
    fun reversePrefix(word: String, ch: Char): String {
        var low = 0
        while (low < word.length && word[low] != ch) {
            low++
        }
        return if (low == word.length) word
        else
            word.substring(0, low.plus(1)).reversed() + word.substring(low.plus(1), word.length)
    }
}