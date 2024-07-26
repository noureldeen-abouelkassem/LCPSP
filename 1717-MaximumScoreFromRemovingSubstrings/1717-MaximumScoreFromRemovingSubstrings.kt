class Solution {
    fun maximumGain(s: String, x: Int, y: Int): Int {
        val stack1 = Stack<Char>()
        val stack2 = Stack<Char>()
        val first = if (x > y) 'a' else 'b'
        val second = if (x > y) 'b' else 'a'
        var result = 0

        s.forEach { char ->
            if (stack1.isNotEmpty() && stack1.peek() == first && char == second) {
                stack1.pop()
                result += maxOf(x, y)
            } else stack1.push(char)
"cdbcbbaaabab"
