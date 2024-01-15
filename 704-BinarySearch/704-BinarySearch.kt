class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var firstIndex = 0
        var lastIndex = nums.size - 1
        while (firstIndex <= lastIndex) {
            val mid = if(firstIndex == 0 && lastIndex == 0) 0 else ((firstIndex + lastIndex) / 2)
            when {
                nums[mid] == target -> return mid
                nums[mid] > target -> lastIndex = mid - 1
                nums[mid] < target -> firstIndex = mid + 1
            }
        }
        return -1
    }
}
[
