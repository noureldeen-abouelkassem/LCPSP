      when(sandwiche) {
        0 -> if (circleStudentCount > 0) circleStudentCount-- else break
        1 -> if (squareStudentCOunt > 0) squareStudentCOunt-- else break
      }
    }

    return circleStudentCount + squareStudentCOunt
    }
}
    var squareStudentCOunt = students.filter { it == 1 }.size

    for (sandwiche in sandwiches) {
[
