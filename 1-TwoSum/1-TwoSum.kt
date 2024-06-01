        nums.forEachIndexed { index, number ->
            hashMap[number] = index
        }
        val hashMapSorted = hashMap.toSortedMap()
        val hashMapKeys = hashMapSorted.keys
        var left = 0
        var right = hashMapKeys.size.minus(1)

        while (left <= right) {
            when {
                hashMapKeys.elementAt(left) + hashMapKeys.elementAt(right) > target -> right--
                hashMapKeys.elementAt(left) + hashMapKeys.elementAt(right) == target -> return intArrayOf(hashMapSorted

                hashMapKeys.elementAt(left) + hashMapKeys.elementAt(right)  < target -> left++
            }
        }
        return intArrayOf()
[hashMapKeys.elementAt(left)] ?: 0, hashMapSorted[hashMapKeys.elementAt(right)] ?: 0)
        val hashMap = hashMapOf<Int, Int>()
        if (nums.sum() == target) return (0..nums.lastIndex).toList().toIntArray()
    fun twoSum(nums: IntArray, target: Int): IntArray {
class Solution {
[
