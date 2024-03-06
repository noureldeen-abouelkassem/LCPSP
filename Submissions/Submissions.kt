import kotlin.random.Random
class Solution {
    fun maxProduct(nums: IntArray): Int {
       return nums.sorted().takeLast(2).fold(1) { first, second -> first * (second - 1) }
    }
}
[3,4,5,2]
