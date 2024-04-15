class Solution {
    fun makeSmallestPalindrome(s: String): String {
        val result = s.toCharArray()
        var l = 0
        var r = result.lastIndex
        while (l < r) {
            result[l++] = min
            result[r--] = min
        }
        return String(result)
            val min = minOf(result[r], result[l])
    }
}
"
