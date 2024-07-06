class Solution {
    fun destCity(paths: List<List<String>>): String {
        val source = mutableSetOf<String>()
        val dest = mutableSetOf<String>()
        paths.forEach { (a, b) ->
            source += a
            dest -= a
            if (b !in source) dest += b
        }
        return dest.first()
    }
}
[["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
