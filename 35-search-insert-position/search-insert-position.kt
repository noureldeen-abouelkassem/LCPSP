class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var low = 0 
        var high = nums.count() - 1
        while (low <= high) {
            val mid = (low + high) / 2
            if (nums[mid] == target) {
                return mid
            }
            if (nums[mid] < target) {
                low = mid + 1
            }
            if (nums[mid] > target) {
                high = mid - 1
            }
        }
        return low
    }
}