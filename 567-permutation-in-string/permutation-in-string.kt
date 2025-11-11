class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        val s1 = s1.toCharArray().sorted().joinToString("")
    for (i in 0..s2.length - s1.length) {
      if (s1.equals(s2.slice(i..<i + s1.length).toCharArray().sorted().joinToString(""))) {
        return true
      }
    }
    return false
    }
}