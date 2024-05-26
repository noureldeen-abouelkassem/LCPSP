class Solution {
     fun longestCommonPrefix(strs: Array<String>): String {
        var result = strs[0]
        result = strs.drop(1).fold(result){ int , acc ->
             int.commonPrefixWith(acc)
        }
        return result
    }
}
[
