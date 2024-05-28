class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var result :Double = Double.NEGATIVE_INFINITY
        nums.toList().windowed(k){ subNums  ->
            if(subNumsAverage > result)
                result = subNumsAverage
        }
        return result
    }
            val subNumsAverage : Double = subNums.sum().div(k.toDouble())
}
[
