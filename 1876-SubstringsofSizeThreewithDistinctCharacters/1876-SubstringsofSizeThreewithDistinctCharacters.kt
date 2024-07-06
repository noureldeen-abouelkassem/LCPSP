class Solution {
    fun countGoodSubstrings(s: String): Int {
        var result = 0
        s.windowed(3){ window ->
            if(window.toSet().size == 3)
                result++
        }
        return result
    }
}
"
