class Solution {
    fun findPermutationDifference(s: String, t: String): Int {
       val sMutableList = mutableMapOf<Char, Int>()
        s.toCharArray().forEachIndexed { index, c ->
            sMutableList[c] = index
        }
        val tMutableList = mutableMapOf<Char, Int>()
        t.toCharArray().forEachIndexed { index, c ->
            tMutableList[c] = index
        }
        var result = 0
        sMutableList.forEach { (t, u) -> 
            result += abs(tMutableList[t]?.minus(u) ?: 0)
        }
        return result  
    }
"
