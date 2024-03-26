class Solution {
    fun findKthPositive(arr: IntArray, k: Int): Int {
        var lo = 0
        var hi = arr.lastIndex
        var res = -1
        while (lo <= hi) {
            val mid = lo + (hi - lo) / 2
            val diff = arr[mid] - mid - 1
            if (diff < k) {
                res = arr[mid] + (k - diff)
                lo = mid + 1
            } else {
                hi  = mid - 1
            }
        }
        return if (res == -1) k else res 
    }
}
[
