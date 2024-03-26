            return false
        if(n == 1) 
            return true
        else
            return powerCheck(1, n)
    }

    private fun powerCheck(current: Int, target: Int): Boolean {
        return if (2.0.pow(current) == target.toDouble())
            true
        else if (2.0.pow(current) < target.toDouble())
            powerCheck(current.plus(1), target)
        else
      if(n < 0) 
    fun isPowerOfTwo(n: Int): Boolean {
class Solution {
1
