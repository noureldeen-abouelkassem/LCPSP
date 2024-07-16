class Solution {
    fun maxFrequencyElements(nums: IntArray): Int {
        val map = hashMapOf<Int, Int>()
        nums.forEach{
            map[it] = map.getOrDefault(it, 0) + 1
        }
        var max = -1
        map.forEach{ key, value ->
        }
    }
            if(value > max)
                max = value
        return map.filter{ it.value == max }.values.sum()
[
