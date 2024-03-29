class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val sorted = nums.sorted()
        val hashMap = hashMapOf<Int, Int>()
        sorted.forEachIndexed { index, i ->
                hashMap.putIfAbsent(i, index)
        }
        val result = mutableListOf<Int>()
        nums.forEach {
            result.add(hashMap[it]!!)
        }
        return result.toIntArray()
    }
}
[
