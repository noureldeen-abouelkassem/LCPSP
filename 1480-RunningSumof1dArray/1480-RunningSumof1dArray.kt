class Solution {
    fun runningSum(nums: IntArray): IntArray {
        var sum = 0
        nums.forEachIndexed { index, i ->
            sum += i
            nums[index] = sum
        }
        return nums
    }
}
[
