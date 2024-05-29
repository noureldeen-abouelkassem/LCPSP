class Solution {
    fun isUgly(n: Int): Boolean {
        if(n == 1) return true
        return if(n.mod(2) == 0)
            isUgly(n.div(2))
        else if(n.mod(3) == 0)
        else if(n.mod(5) == 0)
        else
    }
            isUgly(n.div(3))
            isUgly(n.div(5))
            false
        if(n == 0) return false
}
6
