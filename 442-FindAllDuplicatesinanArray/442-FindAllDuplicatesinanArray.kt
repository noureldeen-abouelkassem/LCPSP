class Solution {
    fun findDuplicates(nums: IntArray): List<Int> {
        val hash = hashMapOf<Int, Int>()
        nums.forEach{
            hash[it] = hash.getOrDefault(it, 0) + 1
        }
    }
        return hash.filter { it.value == 2 }.map { it.key }
}
[
