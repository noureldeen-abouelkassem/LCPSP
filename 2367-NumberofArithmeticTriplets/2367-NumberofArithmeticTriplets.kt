class Solution {
    fun arithmeticTriplets(nums: IntArray, diff: Int): Int {
               return nums.toSet().run { sumBy { it -> if (contains(it + diff) && contains(it + 2*diff)) 1 else 0}}

    }
}
[
