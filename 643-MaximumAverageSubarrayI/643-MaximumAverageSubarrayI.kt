class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var windowSum = 0
        var windowStart = 0
        var result = Double.NEGATIVE_INFINITY
        for (windowEnd in 0..nums.lastIndex) {
            windowSum += nums[windowEnd]
            if (windowEnd >= k.minus(1)) {
                val average = windowSum.div(k * 1.0)
                if (average > result) {
                    result = average
                }
                windowSum -= nums[windowStart]
                windowStart++
            }
        }
        return result
    }
}
[
