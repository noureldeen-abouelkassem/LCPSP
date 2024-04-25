class Solution {
    fun sumOfSquares(nums: IntArray): Int {
        val n = nums.size
        var sum = 0
        var i = 1

        for (num in nums) {
            if (n % i == 0) {
                sum += num * num
            }
            i++
        }

        return sum
    }
}
[
