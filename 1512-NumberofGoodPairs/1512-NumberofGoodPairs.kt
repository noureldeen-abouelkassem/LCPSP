class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        var result = 0
        val numberCount: HashMap<Int, Int> = hashMapOf()
        nums.forEach {
            numberCount[it] = numberCount.getOrDefault(it, 0) + 1
        }
        numberCount.filter {
            it.value ==1
        }
        numberCount.forEach { t, u ->
            result = result + ((u*(u-1))/2)
        }
        return result
    }
}
