class Solution {
    fun countKDifference(nums: IntArray, k: Int): Int {
        var count = 0
        for (i in 0..nums.lastIndex) {
            for (j in i.inc()..nums.lastIndex) {
                if (abs(nums[i] - nums[j]) == k) {
                    count++
                }
            }
        }
        return count
    }
}
[1,2,2,1]
