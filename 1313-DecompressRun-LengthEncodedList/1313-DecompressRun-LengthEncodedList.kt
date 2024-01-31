class Solution {
    fun decompressRLElist(nums: IntArray): IntArray {
        val result = mutableListOf<Int>()
        for (i in 0..nums.lastIndex step 2) {
            result.addAll(convertNumberToArray(nums[i], nums[i+1]))
        }
        return result.toIntArray()
    }

    private fun convertNumberToArray(repeats: Int, value: Int): Array<Int> {
        return (BigInteger.TEN.pow(repeats).subtract(BigInteger.ONE).divide(BigInteger.valueOf(9))).toString().toCharArray().map {
         it.digitToInt() * value
        }.toTypedArray()
    }
}
[
