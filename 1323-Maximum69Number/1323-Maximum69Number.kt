class Solution {
    fun maximum69Number (num: Int): Int {
       val indexOfNumber = num.toString().indexOfFirst { it == '6' }
    }
        return if (indexOfNumber == -1) num else num + (3 * Math.pow(10.0, num.toString().length -1 - indexOfNumber.toDouble()).toInt())
}
9
