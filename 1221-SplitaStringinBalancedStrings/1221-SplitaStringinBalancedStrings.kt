class Solution {
    fun balancedStringSplit(s: String): Int {
        val L = 'L'
        val R = 'R'
        var LCounter = 0
        var RCounter = 0
        var result = 0
        s.forEach {
            if(it == L)
                LCounter ++
            if(it == R)
                RCounter ++
            if(LCounter == RCounter) {
                LCounter = 0
                RCounter = 0
                result++
            }
        }
        return result
    }
}
