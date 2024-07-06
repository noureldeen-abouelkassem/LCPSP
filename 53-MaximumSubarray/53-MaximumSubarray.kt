    }
}
        for (num in nums) {
            prefixSum = if (prefixSum < 0) num else (prefixSum + num)
            maxSum = Math.max(maxSum, prefixSum)
        }
        return maxSum
        var prefixSum = 0
        var maxSum = nums[0]
    fun maxSubArray(nums: IntArray): Int {
class Solution {
[
