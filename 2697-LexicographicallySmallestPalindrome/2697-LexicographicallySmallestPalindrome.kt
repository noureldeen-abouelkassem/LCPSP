class Solution {
    fun makeSmallestPalindrome(s: String): String {
        var j = s.lastIndex
        val result = s.toMutableList()
        for(index in 0 .. s.lastIndex/2){
            if (result[index] != result[j]) {
                if(result[index] > result[j]){
                } else {
                    result[j] = result[index]
                }
            }
                    result[index] = result[j]
            j--
        }
        return result.joinToString("")
    }
"
