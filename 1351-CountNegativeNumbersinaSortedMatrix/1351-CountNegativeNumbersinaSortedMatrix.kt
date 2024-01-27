class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        val bigArray = mutableListOf<Int>()
        grid.forEach {
            bigArray.addAll(it.toList())
        }
        var negativeCount = 0
        bigArray.forEach {
            if(it < 0)
                negativeCount++
        }
        return negativeCount
    }
}
[
