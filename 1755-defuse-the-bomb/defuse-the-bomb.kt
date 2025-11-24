class Solution {
    fun decrypt(codes: IntArray, k: Int): IntArray {
        if (codes.size == 1) return intArrayOf(0)
        val code = codes.toMutableList()
        return when {
            k == 0 -> IntArray(code.size).apply { fill(0) }
            k > 0 -> {
                ints(code, k)
            }

            else -> {
                ints(code.reversed().toMutableList(), k*-1).reversedArray()
            }
        }
    }

    private fun ints(code: MutableList<Int>, k: Int): IntArray {
        val result = mutableListOf<Int>()
        for (windowStart in 1..code.size) {
            var windowEnd = windowStart.plus(k.minus(1))
            if (windowEnd >= code.size) {
                windowEnd -= code.size
            }
            if (windowStart > windowEnd) {
                val first = code.slice(windowStart..code.lastIndex)
                val second = code.slice(0..windowEnd)
                result.add(first.sum() + second.sum())
            } else {
                result.add(code.slice(windowStart..windowEnd).sum())
            }
        }
        return result.toIntArray()
    }
}