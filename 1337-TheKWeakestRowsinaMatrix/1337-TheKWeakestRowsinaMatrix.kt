            .toIntArray()
            .take(k)
            .map{ it.second }
class Solution {
    fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
        return mat
            .map{ it.sum() }
            .mapIndexed{ index, strength -> Pair(strength, index) }
            .sortedBy{ it.first }
    }
}
[
