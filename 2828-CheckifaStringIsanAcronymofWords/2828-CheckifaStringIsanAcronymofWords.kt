class Solution {
    fun isAcronym(words: List<String>, s: String): Boolean {
        return words.fold(""){acc, cur -> acc.plus(cur[0]) } == s
    }
}
["alice","bob","charlie"]
