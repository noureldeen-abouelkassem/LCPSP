class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        if (nums.size == 1) return (nums[0].toDouble() / k)
        if (nums.size <= k) return (nums.sum().toDouble() / k)
        var answer = 0
        var sum = 0
        for (i in 0 until k) {
            sum += nums[i]
        }
        answer = sum
        for (i in k .. nums.lastIndex) {
            sum += nums[i] - nums[i - k]
            answer = answer.coerceAtLeast(sum)
        }
        return answer.toDouble().div(k)
    }
}