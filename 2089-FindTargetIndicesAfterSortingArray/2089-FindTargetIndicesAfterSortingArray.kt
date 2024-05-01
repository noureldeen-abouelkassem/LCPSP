class Solution {
    fun targetIndices(nums: IntArray, target: Int): List<Int> {
        Arrays.sort(nums)
    if (target > nums.last() || target < nums.first()) return emptyList()
    val list = mutableListOf<Int>()
    for (i in 0 until nums.size) {
        if (nums[i] == target) {
            list.add(i)
        }
        if (nums[i] > target) break
    }
    return list
    }
}
[1,2,5,2,3]
