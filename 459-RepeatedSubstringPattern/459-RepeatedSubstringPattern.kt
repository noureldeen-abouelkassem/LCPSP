class Solution {
    fun repeatedSubstringPattern(s: String): Boolean {
        if (s.length <= 1) return false
        if (s.toSet().size == 1) return true
        var windowEnd = 1
        while (windowEnd < s.lastIndex) {
            if(s.substring(windowEnd.plus(1)..s.lastIndex).split(s.substring(0..windowEnd)).any { it.
                windowEnd++
            } else {
                return true
isNotEmpty() }){
"
