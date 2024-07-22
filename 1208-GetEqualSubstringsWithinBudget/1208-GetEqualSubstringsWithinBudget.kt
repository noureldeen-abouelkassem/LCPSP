class Solution {
    fun equalSubstring(s: String, t: String, maxCost: Int): Int {
        var left = 0
        var totalCost = 0
        var best = 0
        for (right in s.indices) {
            var costOfRight = abs(s[right]-t[right]).toInt()
            totalCost+= costOfRight
            while (totalCost > maxCost) {
                var costOfLeft = abs(s[left]-t[left]).toInt()
                totalCost-= costOfLeft
                left++
            }
"abcd"
