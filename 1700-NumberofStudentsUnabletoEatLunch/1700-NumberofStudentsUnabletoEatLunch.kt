        var studentsCounter = 0
        var sandwichesCounter = 0
        while (studentsCounter <= studentsStack.lastIndex) {
            if (studentsStack[0] == sandwiches[sandwichesCounter]) {
                result -= 1
                sandwichesCounter++
                studentsCounter = 0
                studentsStack.removeFirst()
            } else {
                val first = studentsStack.removeFirst()
                studentsStack.addLast(first)
                studentsCounter++
            }
        }
        return result
    }
[
