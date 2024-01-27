class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        return grid.sumBy { it.count { it < 0 } }
    }
}
[[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
