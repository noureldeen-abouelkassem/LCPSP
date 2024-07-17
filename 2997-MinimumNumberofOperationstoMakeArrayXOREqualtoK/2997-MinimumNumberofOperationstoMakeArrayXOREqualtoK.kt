class Solution {
    fun minOperations(nums: IntArray, k: Int): Int =
    (nums.reduce { acc, num -> acc xor num } xor k).countOneBits()
}
[2,1,3,4]
