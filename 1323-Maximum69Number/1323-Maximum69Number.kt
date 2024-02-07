class Solution {
    fun maximum69Number (num: Int): Int {
       val numString = num.toString()
        val minusNumberString = StringBuilder()
        for (i in numString.indices) {
            minusNumberString.append("9")
        }
        val resultString = StringBuilder()
        val remainingLength = (Integer.parseInt(minusNumberString.toString()) - num).toString().length
        for (i in 0 .. numString.length - remainingLength) {
            resultString.append("9")
        }
        resultString.append(numString.substring((numString.length - remainingLength) +1 ,numString.length))
        return Integer.parseInt(resultString.toString()) 
    }
}
9
