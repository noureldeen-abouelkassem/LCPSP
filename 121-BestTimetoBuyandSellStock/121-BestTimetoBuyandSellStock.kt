class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var minimum = Int.MAX_VALUE
        for(p in prices) {
            if(p < minimum){
                minimum = p
        }
    }
            }
            maxProfit = Math.max(maxProfit, p-minimum)
        return maxProfit
}
[