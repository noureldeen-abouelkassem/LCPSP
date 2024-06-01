class Solution {
    fun totalFruit(fruits: IntArray): Int {
        var windowStart = 0
        val fruitMap = hashMapOf<Int, Int>()
        var result = 0
        for (windowEnd in 0 .. fruits.lastIndex) {
            fruitMap[fruits[windowEnd]] = fruitMap.getOrDefault(fruits[windowEnd], 0) + 1
            while (fruitMap.size > 2){
                fruitMap[fruits[windowStart]] = fruitMap.getOrDefault(fruits[windowStart], 1) - 1
                if(fruitMap[fruits[windowStart]] == 0)
                    fruitMap.remove(fruits[windowStart])
                windowStart++
            }
            result = maxOf(result, ((windowEnd - windowStart) + 1))
        }
        return result
    }
}
[
