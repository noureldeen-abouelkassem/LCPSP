class Solution {
    fun checkIfPangram(sentence: String): Boolean {
            val hashMap = hashMapOf<Char, Int>()
        for (char in 'a'..'z') {
            hashMap[char] = 0
        }
        sentence.forEach { character ->
            hashMap[character] = hashMap.get(character)?.let {
                it + 1
            } ?: 0
        }
        return hashMap.values.contains(0).not()
    }
}