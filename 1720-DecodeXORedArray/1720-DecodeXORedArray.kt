class Solution {
     fun decode(encoded: IntArray, first: Int): IntArray {
        val array = mutableListOf<Int>()
        array.add(first)
        encoded.forEachIndexed { index, i ->
            array.add(index.inc(), array[index] xor i)
        }
        return array.toIntArray()
    }
}
[
