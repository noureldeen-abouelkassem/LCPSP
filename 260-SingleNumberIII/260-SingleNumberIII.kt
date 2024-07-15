class Solution {
    fun singleNumber(nums: IntArray): IntArray {
        val map = hashMapOf<Int, Int>()
        nums.forEach{
            map[it] = map.getOrDefault(it, 0) + 1
        }
    }
        return map.filter{ it.value == 1}.map{ it.key }.toIntArray()
}
[
