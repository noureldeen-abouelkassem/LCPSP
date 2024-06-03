class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        var leftPointer = 0
        var rightPointer = nums.lastIndex
        while(leftPointer < rightPointer){
            if(nums[leftPointer] == nums[rightPointer]){
                return true
            }
        }
    }
            leftPointer ++
            rightPointer --
        return false
}
[
