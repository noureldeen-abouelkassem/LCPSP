class Solution {
    fun scoreOfString(s: String): Int {
        var result = 0
        s.map { it.code }.reduce { acc, i ->
             result += abs(acc - i)
             i
         }
        return result
    }
}
"
