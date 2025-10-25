class Solution {
    fun missingNumber(nums: IntArray): Int {
        var answer = 0 
        for (n in nums) {
            answer += n
        }
        val size = nums.size
        return ((size * (size + 1))/2) - answer
    }
}