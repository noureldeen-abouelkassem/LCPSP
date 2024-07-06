class Solution {
    fun restoreString(s: String, indices: IntArray): String {
        var stringResult = String()
        val result = arrayListOf<Char>()
        s.forEach {
            result.add(it)
        }
        indices.forEachIndexed { index, _ ->
            result[indices[index]] = s[index]
        }
        result.forEach {
            stringResult += it
        }
        return stringResult
    }

"
