class Solution {
    fun countKDifference(nums: IntArray, k: Int): Int {
        val pairings = nums
            .groupBy { it - k }
        val pairsCount = nums
            .sumOf {
                pairings.getOrDefault(it, emptyList())
                    .size
            }
        return pairsCount
    }
}
[
