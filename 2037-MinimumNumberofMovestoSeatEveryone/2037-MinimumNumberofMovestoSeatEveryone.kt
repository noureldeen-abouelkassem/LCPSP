class Solution {
    fun minMovesToSeat(seats: IntArray, students: IntArray): Int {
        val seatsSorted = seats.sorted()
        val studentsSorted = students.sorted()
        var moves = 0
        studentsSorted.forEachIndexed { index, i ->
            moves += abs(seatsSorted[index] - i)
        }
        return moves
    }
}
[
