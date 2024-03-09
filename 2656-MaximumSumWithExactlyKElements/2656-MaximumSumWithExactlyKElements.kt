class Solution {
    fun maximizeSum(nums: IntArray, k: Int): Int {
        var maxOfNums = nums.maxOf { it }
        var result = 0
        repeat(k){
            result += maxOfNums
            maxOfNums += 1
        }
    }
        return result
}
[
