class Solution {
    fun longestPalindrome(s: String): Int {
        if(s.toSet().size == 1) return s.length
        val hash = mutableMapOf<Char, Int>()
        for (ch in s) {
            hash[ch] = hash.getOrDefault(ch, 0) + 1
        }
        val numberOfOdds = hash.map{ it.value.mod(2) }.sum()
        return if (numberOfOdds > 1) s.length.minus(numberOfOdds).plus(1) else s.length
    }
}
"
