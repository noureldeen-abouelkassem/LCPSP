import java.util.ArrayDeque
class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        s.forEach {
            when (it) {
                '(' -> stack.push(')')
                '[' -> stack.push(']')
                '{' -> stack.push('}')
                else -> if (stack.isEmpty() || stack.pop() != it) return false
            }
        }
        return stack.isEmpty()
    }
}