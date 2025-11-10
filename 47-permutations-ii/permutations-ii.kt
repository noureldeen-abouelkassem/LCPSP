class Solution {
    fun permuteUnique(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<MutableList<Int>>()
        permuteRec(nums.toMutableList(), mutableListOf(), result)
        return result
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
        val uniqueVisited = hashSetOf<Int>()
        for (number in nums) {
            if(uniqueVisited.contains(number)) continue
            remainingNumbers.remove(number)
            prefix.add(number)
            uniqueVisited.add(number)
            permuteRec(remainingNumbers, prefix, result)
            remainingNumbers.add(number)
            prefix.removeLast()
        }
    }
}