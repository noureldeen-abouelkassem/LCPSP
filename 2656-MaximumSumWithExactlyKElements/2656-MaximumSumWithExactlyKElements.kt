    fun maximizeSum(nums: IntArray, k: Int): Int {
        return maximizeSumRecursive(nums.sorted(), k)
    }

    private fun maximizeSumRecursive(nums: List<Int>, k: Int): Int {
        if (k == 0) {
            return result
        } else {
            val mutableNums = nums.toMutableList()
            val mutableNumsLast = mutableNums.last()
            result += mutableNumsLast
            mutableNums[nums.lastIndex] =mutableNumsLast.plus(1)
            return maximizeSumRecursive(mutableNums, k - 1)
        }
    private var result = 0
class Solution {
[
