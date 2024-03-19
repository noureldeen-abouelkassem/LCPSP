class Solution {
    fun search(nums: IntArray, target: Int): Int {
         return nums.find { it == target } ?: -1
    }
}
[
