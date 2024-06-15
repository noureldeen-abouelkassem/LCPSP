class Solution {
    fun makeGood(s: String): String {
        val res = StringBuilder()
        for(i in 0..s.lastIndex) {
            if(res.length > 0 && abs(res.get(res.length - 1) - s[i]) == 32) {
                res.deleteAt(res.length - 1)
            } else {
                res.append(s[i])
            }
        }
        return res.toString()
    }
}
"leEeetcode"
