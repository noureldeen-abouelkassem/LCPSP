class Solution {
    fun replaceDigits(s: String): String {
         val stringBuilder = StringBuilder()
        s.forEachIndexed { index, c ->
            if(index % 2 == 0) {
                stringBuilder.append(c)
            } else {
                stringBuilder.append(s[index.minus(1)].plus(c.digitToInt()))
            }
        }
        return stringBuilder.toString()
    }
}
"
