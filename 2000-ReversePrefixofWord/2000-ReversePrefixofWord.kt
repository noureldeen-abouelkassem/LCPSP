class Solution {
    fun reversePrefix(word: String, ch: Char): String {
        val indexOfFirstCh = word.indexOfFirst { it == ch }
        return if (indexOfFirstCh == word.lastIndex)
            word.reversed()
        else
            word.slice(0..indexOfFirstCh).reversed() + word.slice(indexOfFirstCh.plus(1)..word.lastIndex)
    }
}
"abcdefd"
