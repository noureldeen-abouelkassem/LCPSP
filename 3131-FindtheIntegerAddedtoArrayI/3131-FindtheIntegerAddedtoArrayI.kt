class Solution {
    fun addedInteger(nums1: IntArray, nums2: IntArray): Int {
        var num2 = nums2[0]
        var pointer = 1
        while(pointer <= nums1.lastIndex){
            num2 += nums2[pointer]
            num1 += nums1[pointer]
            pointer++
        }
        return (num2 - num1) / nums1.size
    }
        var num1 = nums1[0]
}
[
