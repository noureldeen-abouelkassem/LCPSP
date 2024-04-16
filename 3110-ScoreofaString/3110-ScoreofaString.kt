class Solution {
    fun scoreOfString(s: String): Int {
        return s.zipWithNext { a, b ->
            abs(a - b)
        }.sum()
    }
}
"
