class Solution {
    fun maxWidthOfVerticalArea(points: Array<IntArray>): Int {
        points.sortBy {
            it.first()
        }
        val areaArray = mutableListOf<Int>()
        for (i in 0 until points.lastIndex) {
            areaArray.add(points[i + 1].first() - points[i].first())
        }
        return areaArray.max()
    }
}
[
