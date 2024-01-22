class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val sorted = nums.sorted()
        val result = mutableListOf<Int>()
        nums.forEach {
            result.add(sorted.indexOf(it))
        }
        return result.toIntArray()
    }
}
[
