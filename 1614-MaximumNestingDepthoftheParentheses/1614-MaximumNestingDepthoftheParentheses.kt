class Solution {
    fun maxDepth(s: String): Int {
        var result = 0
        var noOfOpenParentheses = 0
        s.forEach {
            if(it == '(')
                noOfOpenParentheses++
            if(it == ')') {
                if(result < noOfOpenParentheses)
                    result = noOfOpenParentheses
                noOfOpenParentheses--
            }
        }
        return result
    }
}
"
