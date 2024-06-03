        return result
    }

    private fun isValidParentheses(s: String): Boolean {
        val stack = mutableListOf<Char>()
        for (char in s) {
            when (char) {
                '(' -> stack.add(char)
                ')' -> {
                    if (stack.isEmpty() || stack.removeAt(stack.size - 1) != '(') return false
                }
            }
        }
        return stack.isEmpty()

        }
            permuatation.removeLast()
3
