class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val stringBuilder = StringBuilder()
        for(i in 0..word1.length.coerceAtLeast(word2.length)){
            word1.getOrNull(i)?.let { stringBuilder.append(it) }
            word2.getOrNull(i)?.let { stringBuilder.append(it) }
        }
        return stringBuilder.toString()
    }
}
"
