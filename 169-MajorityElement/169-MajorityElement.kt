class Solution {
    fun majorityElement(nums: IntArray): Int {
        val hash = mutableMapOf<Int, Int>()
        nums.forEach {
            hash[it] = hash.getOrDefault(it, 0) + 1
        }
        return hash.filter { it.value > nums.size/2 }.entries.firstOrNull()?.key ?: 0
    }
}
[
