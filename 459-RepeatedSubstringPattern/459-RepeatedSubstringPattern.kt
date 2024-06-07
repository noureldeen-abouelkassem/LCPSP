class Solution {
    fun repeatedSubstringPattern(s: String): Boolean {
        if (s.length <= 1) return false
        if (s.toSet().size == 1) return true
        var windowEnd = 1
        while (windowEnd < s.lastIndex) {
            if(s.split(s.substring(windowEnd.plus(1)..s.lastIndex)).any { it.isNotEmpty() }){
                windowEnd++
            } else {
                return true
            }
"
