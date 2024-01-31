class Solution {
  fun decompressRLElist(nums: IntArray): IntArray =
    decompress(nums, 0, mutableListOf<Int>()).toIntArray()

fun decompress(nums: IntArray, index: Int, result: MutableList<Int>): List<Int> {
    
    if (index >= nums.size) return result
    
    repeat(nums[index]) {
        result.add(nums[index + 1])
    }

    return decompress(nums, index + 2, result)
}
}

[
