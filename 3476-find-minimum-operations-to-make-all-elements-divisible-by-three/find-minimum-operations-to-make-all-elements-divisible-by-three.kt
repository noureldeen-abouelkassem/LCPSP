class Solution {
    fun minimumOperations(nums: IntArray): Int {
        return nums.filter{ it % 3 != 0}.count()
    }
}