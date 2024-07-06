import kotlin.math.abs
    fun sortedSquares(nums: IntArray): IntArray {
        var left = 0
        var right = nums.lastIndex
        for(i in nums.lastIndex downTo 0) {
            if(abs(nums[left]) < abs(nums[right])){
            } else {
            }
        }
    }
class Solution {
        val result = IntArray(nums.size)
                result[i] = nums[right] * nums[right]
                right--
                result[i] = nums[left] * nums[left]
                left++
        return result
}
[
