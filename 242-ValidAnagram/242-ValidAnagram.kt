class Solution {
    fun isAnagram(s: String, t: String): Boolean = s.groupingBy { it }.eachCount() == t.groupingBy { it }.
eachCount()
}
"
