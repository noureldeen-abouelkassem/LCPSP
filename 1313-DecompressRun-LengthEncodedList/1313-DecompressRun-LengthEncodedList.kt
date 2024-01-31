class Solution {
    fun decompressRLElist(nums: IntArray): IntArray {
        val result = mutableListOf<Int>()
        for (i in 0..nums.lastIndex step 2) {
            repeat(nums[i]){
                result.add(nums[i+1])
            }
        }
        return result.toIntArray()
    }
}
[
