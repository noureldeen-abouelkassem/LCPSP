class Solution {
    fun maximumCount(nums: IntArray): Int {
        return maxOf(nums.filter { it > 0 }.size, nums.filter { it < 0 }.size)
    }
}
[
