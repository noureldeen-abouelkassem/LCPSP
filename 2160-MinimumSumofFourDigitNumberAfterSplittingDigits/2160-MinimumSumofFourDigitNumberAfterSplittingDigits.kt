class Solution {
    fun minimumSum(num: Int): Int {
        val numSorted = num.toString().toCharArray().sortedArray().joinToString("")
        return ((numSorted[0].digitToInt() * 10) + numSorted[2].digitToInt()) + ((numSorted[1].digitToInt() * 10) + 
numSorted[3].digitToInt())
    }
}
2
