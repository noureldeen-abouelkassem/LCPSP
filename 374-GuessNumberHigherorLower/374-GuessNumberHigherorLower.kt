 */

class Solution:GuessGame() {
    override fun guessNumber(n:Int):Int {
        var l = 1
        var r = n
        while (l <= r) {
            val mid = l + (r - l) / 2
            when (guess(mid)) {
                -1 -> r = mid - 1
                1 -> l = mid + 1
                else -> return mid
            }
        }
        return -1
    }
10
