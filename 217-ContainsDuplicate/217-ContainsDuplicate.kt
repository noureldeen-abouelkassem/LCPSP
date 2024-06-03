class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val sortedNums = nums.sorted()
        for(i in 1..nums.lastIndex) {
            if(sortedNums[i.minus(1)] == sortedNums[i]){
                return true
            }
        }
    }
        return false
}
[
