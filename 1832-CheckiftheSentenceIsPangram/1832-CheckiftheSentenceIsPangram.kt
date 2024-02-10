class Solution {
    fun checkIfPangram(sentence: String): Boolean {
        val alphabeticSet = mutableSetOf<Char>()
        for (c in 'a'..'z'){
            alphabeticSet.add(c)
        }
        val sentenceUniqueChars = sentence.lowercase().toCharArray().toSet()
        sentenceUniqueChars.forEach { 
            alphabeticSet.remove(it)
        }
        return alphabeticSet.isEmpty()
    }
}
"
