class Solution {
    fun minPartitions(n: String): Int {
       var num  = 0
            n.forEach {
                val digit = it.digitToInt()
                if (digit > num) num = digit
            }
        return num
    }
}
"
