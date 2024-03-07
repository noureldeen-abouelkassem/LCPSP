class Solution {
    fun findIntersectionValues(nums1: IntArray, nums2: IntArray): IntArray {
       val num2Set = nums2.toHashSet()
        val num1Set = nums1.toHashSet()
        var num1 = 0
        var num2 = 0
        nums1.forEach {
            if(num2Set.contains(it)) num1 += 1
        }
        nums2.forEach {
            if(num1Set.contains(it)) num2 += 1
        }
        return intArrayOf(
            num1,
            num2
        ) 
[
