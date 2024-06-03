class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        for (ch in s) {
            when(ch) {
                '(' , '[' , '{' -> stack.addFirst(ch)
            }
        }
    }
                ')' -> if(stack.isEmpty() || stack.removeFirstOrNull() != '(') return false
                ']' -> if(stack.isEmpty() || stack.removeFirstOrNull() != '[') return false
                '}' -> if(stack.isEmpty() || stack.removeFirstOrNull() != '{') return false
        return stack.isEmpty()
}
"
