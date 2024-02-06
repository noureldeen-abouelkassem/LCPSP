class Solution {
    fun arithmeticTriplets(nums: IntArray, diff: Int): Int {
        var count = 0
        val setNum = nums.toSet()
        val map = hashMapOf<Int, Int>()
        setNum.forEach {
            map[it] = 1
        }
        setNum.forEach { 
            if(map[it.plus(diff)] == 1 && map[it.plus(diff * 2)] == 1)
                count++
        }
        return count
    }
}
[
