class Solution {
    fun minIncrementForUnique(nums: IntArray): Int {
        nums.sort()
        var numTracker = 0
        var minIncrement = 0
        for (num in nums) {
            numTracker = maxOf(numTracker, num)
            minIncrement += numTracker - num
            numTracker += 1
        }
        return minIncrement
    }
}
[
