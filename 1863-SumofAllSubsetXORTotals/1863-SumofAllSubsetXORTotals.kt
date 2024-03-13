class Solution {
    fun subsetXORSum(nums: IntArray): Int {
         var result = 0
        for (num in nums) {
            result = result or num
        }

        return result * 2.0.pow(nums.lastIndex.toDouble()).toInt()
    }
}
[
