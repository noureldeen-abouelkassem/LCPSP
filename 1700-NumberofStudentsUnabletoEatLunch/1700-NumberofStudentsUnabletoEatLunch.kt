        while (couldntServe < students.size && !studentsQueue.isEmpty()) {
            val studentHead = studentsQueue.poll()
            val match = studentHead == sandwichesQueue.peek()
            if (match) {
                sandwichesQueue.poll()
                couldntServe = 0
            } else {

        var couldntServe = 0
                studentsQueue.add(studentHead)
                couldntServe++
            }
        }

        return studentsQueue.size
    }
[
