        var windowStart = 0
        var length = 0
        val hashSet = HashSet<Char>()
        for (windowEnd in 0..s.lastIndex) {
            while(hashSet.contains(s[windowEnd])){
                windowStart++
            hashSet.add(s[windowEnd])
            length = maxOf(length, (windowEnd - windowStart) + 1)
        }
        return length
            }
                hashSet.remove(s[windowStart])
        fun lengthOfLongestSubstring(s: String): Int {
class Solution {
        }
}
"
