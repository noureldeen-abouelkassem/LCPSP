class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var max = 0
        accounts.forEach {
            val sum = it.sum()
            if(sum > max) {
                max = sum
            }
        }
        return max
    }
}
[
