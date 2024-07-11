class Solution {
    fun missingNumber(nums: IntArray): Int {
        return (0..nums.size).toMutableList().subtract(nums.sorted().toSet()).lastOrNull() ?: 0
    }
}
[
