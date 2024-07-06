class Solution {
    fun sum(num1: Int, num2: Int): Int {
        var x = num1
        var y = num2
        while (y != 0) {
             val carry = x and y
             x = x xor y
             y = carry shl 1
         }
        return x
    }
}
1
