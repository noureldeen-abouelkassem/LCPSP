class Solution {
    fun search(nums: IntArray, target: Int): Int {
        return binarySearch(nums, target, 0, nums.lastIndex)
    }
    private fun binarySearch(nums: IntArray, target: Int, start: Int, end: Int) : Int{
        if(start>end) return  -1
        val middle = start + (end - start) / 2
        return when{
            else -> binarySearch(nums, target, middle.plus(1), end)
        }
            nums[middle] == target -> middle
            nums[middle] > target -> binarySearch(nums, target, start, middle.minus(1))
    }
}
[
