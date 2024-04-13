class Solution {
    fun countAsterisks(s: String): Int {
         return s.split("\\|[^|]*\\|".toRegex())
    }
         .filter { it.isEmpty().not() }
         .sumOf { it.count { char ->  char == '*' } }
}
"
