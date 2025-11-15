class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) return 0
        if (s.toSet().size == s.length) return s.length
        var length = 0
        val set = hashSetOf<Char>()
        var windowStart = 0
        for (windowEnd in 0..s.lastIndex) {
            while (set.contains(s[windowEnd])) {
                set.remove(s[windowStart])
                windowStart++
            }
            set.add(s[windowEnd])
            length = maxOf(length, (windowEnd - windowStart) + 1)
        }
        return length
    }
}