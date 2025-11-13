class Solution {
    fun findEvenNumbers(digits: IntArray): IntArray {
        val result = mutableListOf<List<Int>>()
        findRec(0, digits, mutableListOf(), result)
        val intArray = mutableListOf<Int>()
        result.filter { it.first() != 0 && intArrayToNumber(it.toIntArray()).mod(2) == 0 }.forEach {
            intArray.add(intArrayToNumber(it.toIntArray()))
        }
        return intArray.toIntArray().sortedArray()
    }

    fun findRec(position: Int, digits: IntArray, prefix: MutableList<Int>, result: MutableList<List<Int>>) {
        if (position == 3) {
            result.add(prefix.toList())
            return
        }
        val remainingDigits = digits.toMutableList()
        val unique = hashSetOf<Int>()
        for (c in digits) {
            if (unique.contains(c)) continue
            remainingDigits.remove(c)
            prefix.add(c)
            unique.add(c)
            findRec(position.plus(1), remainingDigits.toIntArray(), prefix, result)
            remainingDigits.add(c)
            prefix.removeLast()
        }
    }

    fun intArrayToNumber(intArray: IntArray): Int {
        var result = 0
        for (digit in intArray) {
            result = result * 10 + digit
        }
        return result
    }
}