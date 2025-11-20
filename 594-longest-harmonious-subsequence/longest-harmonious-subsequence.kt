class Solution {
    fun findLHS(nums: IntArray): Int {
        if (nums.toSet().size == 1) return 0
        if (nums.size == 1) return 0
        nums.sort()
        var windowEnd = 0
        var length = 0
        for (windowStart in 0..nums.lastIndex) {
            while (nums[windowStart] - nums[windowEnd] > 1){
                windowEnd++
            }
            if (nums[windowStart] - nums[windowEnd] == 1) {
                length = maxOf(length, windowStart - windowEnd + 1)
            }
        }
        return length
    }
}