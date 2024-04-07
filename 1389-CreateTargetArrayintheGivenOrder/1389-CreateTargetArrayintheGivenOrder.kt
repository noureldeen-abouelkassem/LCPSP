class Solution {
    fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
        val result = mutableListOf<Int>()
        index.forEachIndexed { pointer, i ->
            result.add(i, nums[pointer])
        }
        return result.toIntArray()
    }
}