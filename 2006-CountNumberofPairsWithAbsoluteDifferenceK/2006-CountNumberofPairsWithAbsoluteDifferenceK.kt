class Solution {
    fun countKDifference(nums: IntArray, k: Int): Int {
        var pairs = 0
        for (i in 0 until nums.size) {
            for (j in i + 1 until nums.size) {
                if (abs(nums[i] - nums[j]) == k)
                    ++pairs
            }
        }
        return pairs
    }
}
[
