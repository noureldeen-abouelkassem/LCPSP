            if (stack2.isNotEmpty() && stack2.peek() == first && char == second) {
                stack2.pop()
                result += minOf(x, y)
            } else stack2.push(char)
        }

        return result
    }
}
"cdbcbbaaabab"
