class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val indexOfPreviousValue = HashMap<Int, Int>()
        for (i in nums.indices) {
            indexOfPreviousValue[nums[i]]?.let {
                if (Math.abs(i - it) <= k) {
                    return true
                }
            }
            indexOfPreviousValue[nums[i]] = i
        }
        return false
    }
}
[
