    }

    fun climbRec(n: Int): Int {
        if(n == 0) 
    }
            return climbRec(n - 2).also{memo[n-2] = it} + climbRec(n - 1).also{memo[n-1] = it}
        return climbRec(n)
        else if (n < 0) 
            return 1
        else 
            return 0
        if(n == 0) return 0
    fun climbStairs(n: Int): Int {
class Solution {
    val memo = hashMapOf<Int, Int>()
        if(memo.containsKey(n)) return memo[n]!!
2
