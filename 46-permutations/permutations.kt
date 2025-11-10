class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<MutableList<Int>>()
        permuteRec(nums.toHashSet(), mutableListOf(), result)
        return result
    }

    fun permuteRec(
        nums: HashSet<Int>,
        prefix: MutableList<Int>,
        result: MutableList<MutableList<Int>>
    ) {
        if (nums.isEmpty()) {
            result.add(prefix.toMutableList())
            return
        }

        val remainingNumbers = nums.toHashSet()
        for (number in nums) {
            remainingNumbers.remove(number)
            prefix.add(number)
            permuteRec(remainingNumbers, prefix, result)
            remainingNumbers.add(number)
            prefix.removeLast()
        }
    }
}