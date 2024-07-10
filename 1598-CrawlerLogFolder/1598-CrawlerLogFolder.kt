class Solution {
    fun minOperations(logs: Array<String>): Int {
        var level = 0
        for (l in logs) {
            when {
                l[0] != '.' -> level++
                l[1] == '.' -> if (level > 0) level--
            }
        }
        return level
    }
}
["d1/","d2/","../","d21/","./"]
