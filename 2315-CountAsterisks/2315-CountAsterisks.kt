class Solution {
    fun countAsterisks(s: String): Int {
         var barCount = 0
        var astrikCount = 0
        s.forEach {
            if (it == '|') barCount++
            if (barCount % 2 == 0 && it == '*') astrikCount++
        }
        return astrikCount
    }
}
"
