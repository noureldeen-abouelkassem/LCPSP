class Solution {
    fun checkIfPangram(sentence: String): Boolean {
        return sentence.lowercase().toCharArray().toSet().size == 26
    }
}
"
