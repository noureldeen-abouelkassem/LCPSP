    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
      var result = letters[0]
    if (result > target || letters.last() <= target) return result
    var left = 0
    var right = letters.lastIndex
    while (left <= right) {
      val mid = (left + right) / 2
      if (letters[mid] > target){
        result = letters[mid]
        right = mid - 1
      } else {
        left = mid + 1
      }
    }
    return result
       }
class Solution {
[
