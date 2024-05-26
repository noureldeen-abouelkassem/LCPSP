class Solution {
     fun longestCommonPrefix(strs: Array<String>): String {
        var result = strs[0]
        result = strs.drop(1).fold(result) { int, acc ->
            val stringBuilder = StringBuilder()
            var counter = 0
                stringBuilder.append(acc[counter])
                counter++
            }
            stringBuilder.toString()
        }
        return result
    }
             while (int.getOrNull(counter) == acc.getOrNull(counter)) {
}
[
