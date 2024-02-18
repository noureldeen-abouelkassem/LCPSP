class Solution {
    fun firstPalindrome(words: Array<String>): String {
        for(i in words) {
            if(i.reversed() == i) {
                return i
            }
        }
        return ""
    }
}
["abc","car","ada","racecar","cool"]
