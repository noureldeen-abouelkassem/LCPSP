class Solution {
    fun subsetXORSum(nums: IntArray): Int {
         var result = 0
        nums.forEach { 
            result = result or it
        }
        return result shl nums.lastIndex
    }
}
[
