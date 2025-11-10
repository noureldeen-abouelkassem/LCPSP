class Solution {
    fun permuteUnique(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<MutableList<Int>>()
        permuteRec(nums.toMutableList(), mutableListOf(), result)
        return result.toHashSet().toList()
    }

    fun permuteRec(
        nums: MutableList<Int>,
        prefix: MutableList<Int>,
        result: MutableList<MutableList<Int>>
    ) {
        if (nums.isEmpty()) {
            result.add(prefix.toMutableList())
            return
        }

        val remainingNumbers = nums.toMutableList()
        for (number in nums) {
            remainingNumbers.remove(number)
            prefix.add(number)
            permuteRec(remainingNumbers, prefix, result)
            remainingNumbers.add(number)
            prefix.removeLast()
        }
    }
}