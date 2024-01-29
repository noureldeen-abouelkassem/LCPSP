class Solution {
    fun numberGame(nums: IntArray): IntArray {
        val numsSorted = nums.sorted()
        val result = mutableListOf<Int>()
        for (i in 1..numsSorted.lastIndex step 2) {
            result.add(numsSorted[i])
            result.add(numsSorted[i - 1])
        }
        return result.toIntArray()
    }
}
[
