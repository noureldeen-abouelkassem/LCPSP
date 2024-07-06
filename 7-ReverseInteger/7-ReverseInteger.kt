class Solution {
    fun reverse(x: Int): Int {
        return try {
        if(x == 0 || x > Int.MAX_VALUE) 0
        if(x>0) x.toString().reversed().toInt() else x.toString().drop(1).reversed().toInt() * -1
        } catch (e: Exception){
            0
        }
    }
}
1
