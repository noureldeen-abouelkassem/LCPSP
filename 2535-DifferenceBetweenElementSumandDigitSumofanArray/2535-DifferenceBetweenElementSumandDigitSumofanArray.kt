    fun differenceOfSum(nums: IntArray): Int {
        val sum = nums.sum()
        val numsString = StringBuilder()
        nums.forEach { 
            numsString.append(it)
        }
        var digitalSum = 0
        numsString.toString().map {
            it.digitToInt() 
        }.forEach { 
            digitalSum += it
        }
        return abs(sum.minus(digitalSum))
    }
}
[
