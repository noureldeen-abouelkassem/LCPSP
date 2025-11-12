class Solution {
        fun generateParenthesis(n: Int): List<String> {
        val result = mutableListOf<String>()
        generateValidParentheses(n, n, "", result)
        return result
    }

    private fun generateValidParentheses(openCount: Int, closeCount: Int, current: String, result: MutableList<String>) {
        if (openCount == 0 && closeCount == 0) {
            result.add(current)
            return
        }

        if (openCount > 0) {
            generateValidParentheses(openCount - 1, closeCount, current + '(', result)
        }

        if (closeCount > openCount) {
            generateValidParentheses(openCount, closeCount - 1, current + ')', result)
        }
    }
}