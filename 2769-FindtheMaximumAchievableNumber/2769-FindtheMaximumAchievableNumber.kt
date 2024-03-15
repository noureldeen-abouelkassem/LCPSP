class Solution {
    fun theMaximumAchievableX(num: Int, t: Int): Int {
       var result = num
        repeat(2){
            result += t
        }
        return result
    }
}
4
