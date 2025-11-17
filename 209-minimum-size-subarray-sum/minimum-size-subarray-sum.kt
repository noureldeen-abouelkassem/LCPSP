class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var sum = 0
        var min = Int.MAX_VALUE
        var windowEnd = 0
        for (windowStart in 0..nums.lastIndex) {
            sum += nums[windowStart]
            while (sum >= target) {
                min = min(min, windowStart - windowEnd + 1)
                sum -= nums[windowEnd++]
            }
        }
        return if (min == Int.MAX_VALUE) 0 else min
    }
}