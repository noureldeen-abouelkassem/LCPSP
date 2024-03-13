class Solution {
    fun subsetXORSum(nums: IntArray): Int {
        return nums.reduce { acc, i -> acc or i } * 2.0.pow(nums.lastIndex.toDouble()).toInt()
    }
}
[
