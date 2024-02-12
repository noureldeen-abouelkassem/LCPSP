class Solution {
    fun countKDifference(nums: IntArray, k: Int): Int {
        val hashMap = mutableMapOf<Pair<Int, Int>, IntArray>()
        nums.forEachIndexed { index, i ->
            hashMap[Pair(index, i)] = nums.sliceArray(index..nums.lastIndex)
        }
        var count = 0
        hashMap.forEach {
            count += it.value.count { value -> abs(value.minus(it.key.second)) == k }
        }
        return count
    }
}
[
