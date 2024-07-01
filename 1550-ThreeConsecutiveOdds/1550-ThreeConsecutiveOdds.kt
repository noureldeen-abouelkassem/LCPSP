class Solution {
    fun threeConsecutiveOdds(arr: IntArray): Boolean {
        var counter = 0
        arr.forEach {
            if(it.mod(2)!=0)
                counter++
        }
        return counter >= 3
            else {
                    counter = 0
            }
                if(counter >= 3){
                    return true
                }else {
    }
                }
}
[
