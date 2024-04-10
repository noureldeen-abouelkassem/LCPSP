class Solution {
    fun singleNonDuplicate(nums: IntArray): Int {
        var start = 0
        var end = nums.lastIndex
        while (start < end) {
            when {
                nums[start] == nums[start.plus(1)] -> start += 2
                nums[end] == nums[end.minus(1)] -> end -= 2
            }
        }
        return nums[start]
    }
[
