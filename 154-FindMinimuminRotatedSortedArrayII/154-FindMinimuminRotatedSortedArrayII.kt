       var index = 0
        if(nums.first()>=nums.last() && nums.size != 1) {
            var minimum = Integer.MIN_VALUE
            while (nums[index] >= minimum && index < nums.lastIndex) {
                minimum = nums[index]
                index++
            }
        }
        return nums[index] 
    fun findMin(nums: IntArray): Int {
class Solution {
[
