class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numsSorted = nums.sorted()
        var leftPointer = 0
        var rightPointer = nums.lastIndex
        while(leftPointer < rightPointer){
            val left = numsSorted[leftPointer]
            val right = numsSorted[rightPointer]
            println(left)
            println(right)
            when {
                left + right == target -> return intArrayOf(nums.indexOfFirst{it == left}, nums.indexOfLast
{it == right})
[2,7,11,15]
              
