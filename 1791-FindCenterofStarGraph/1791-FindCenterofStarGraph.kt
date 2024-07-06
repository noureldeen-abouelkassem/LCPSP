class Solution {
    fun findCenter(edges: Array<IntArray>): Int {
        val u1 = edges[0][0]
        val v1 = edges[0][1]
        val u2 = edges[1][0]
        val v2 = edges[1][1]
        return if (u1 == u2 || u1 == v2) {
            u1
        } else {
            v1
        }
    }
}
[
