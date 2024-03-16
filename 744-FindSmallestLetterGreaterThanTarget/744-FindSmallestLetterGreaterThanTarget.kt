class Solution {
    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        var l = 0
        var r = letters.lastIndex
        while (l <= r) {
            val mid = l + (r - l) / 2
            if (letters[mid] > target) {
                r = mid - 1
            } else {
                l = mid + 1
            }
        }
        val resultIndex = if(l in letters.indices) l else 0
        return letters[resultIndex]
       }
}
[
