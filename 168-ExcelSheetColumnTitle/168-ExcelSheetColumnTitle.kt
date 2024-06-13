class Solution {
    fun convertToTitle(columnNumber: Int): String {
        val sb = StringBuilder()
        var cn = columnNumber
        while(cn-- > 0) {
            sb.insert(0, 'A' + cn % 26)
            cn /= 26
        }
        return sb.toString()
    }
}
1
