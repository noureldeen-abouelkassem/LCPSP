class Solution {
    fun isAcronym(words: List<String>, s: String): Boolean {
        if (s.length != words.size) return false
        s.forEachIndexed { index, c ->
            if (c != words[index].first()) return false
        }
        return true
    }
}
["alice","bob","charlie"]
