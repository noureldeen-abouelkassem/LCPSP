                result.add(number)
        }
        return result.toIntArray()
    }

    fun binarySearch(list: IntArray, number: Int) : Int {
        var start = 0
        var end = list.lastIndex
        val result = -1
        while (start <= end) {
            val middle = start + ((end - start) / 2)
            when {
                list[middle] == number -> return list[middle]
                list[middle] < number -> start = middle + 1
                else -> end = middle - 1
            }
        }
        return result
            if(number != -1)
            val number = binarySearch(num2Set.toIntArray(), it)
        num1Set.forEach {
        val result = mutableListOf<Int>()
        val num2Set = nums2.toSet().sorted()
        val num1Set = nums1.toSet()
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
class Solution {
[
