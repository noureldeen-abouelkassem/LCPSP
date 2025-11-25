class Solution {
    fun reverseVowels(s: String): String {
        val vowels = setOf(
            'U', 'u', 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o',
        )
        var left = 0
        var right = s.lastIndex
        val char = s.toMutableList()
        while (left < right) {
            if (vowels.contains(char[left]).not()) {
                left++
            }
            if (vowels.contains(char[right]).not()) {
                right--
            }
            if (vowels.contains(char[left]) && vowels.contains(char[right])) {
                val temp = char[right]
                char[right] = char[left]
                char[left] = temp
                left++
                right--
            }
        }
        return char.joinToString("")
    }
}