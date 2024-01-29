class Solution {
    fun numberGame(nums: IntArray): IntArray {
         nums.sort()
        for (i in 0 until nums.lastIndex step 2) {
            val temp = nums[i]
            nums[i] = nums[i + 1]
            nums[i+1] = temp
        }
        return nums
    }
}
[
