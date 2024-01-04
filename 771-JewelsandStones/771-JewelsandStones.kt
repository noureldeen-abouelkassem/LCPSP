class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        return stones.filter {
            it in jewels
        }.length
    }
}
