class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) return 0
        if (s.toSet().size == s.length) return s.length
        var length = 0
        val set = hashSetOf<Char>()
        var windowEnd = 0
        for (windowStart in 0..s.lastIndex) {
            while (set.contains(s[windowStart])) {
                set.remove(s[windowEnd])
                windowEnd++
            }
            set.add(s[windowStart])
            length = maxOf(length, (windowStart - windowEnd) + 1)
        }
        return length
    }
}