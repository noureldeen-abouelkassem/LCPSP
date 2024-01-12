class Solution {
    fun truncateSentence(s: String, k: Int): String {
        var result = ""
        val arrayString = s.split(" ".toRegex())
        arrayString.forEachIndexed { index, string ->
            if (index < k)
                result += "$string "
        }
        return result.trim()
    }
}
"
