class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var low = 0
        var high = nums.size - 1
        var mid = (low + high) / 2
        while (low <= high) {
            when {
                nums[mid] == target -> return mid
                nums[mid] < target -> low = mid + 1
                else -> high = mid - 1
            }
            mid = (low + high) / 2
        }
        return -1
    }
}