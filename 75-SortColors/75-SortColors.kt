            hashMap[it] = hashMap.getOrDefault(it, 0) + 1
        }
        var index = 0
        hashMap.forEach { number->
            repeat(number.value){
                nums[index] = number.key
                index ++
            }
        }
    }
}
       val hashMap = hashMapOf<Int, Int>()
        nums.forEach {
class Solution {
    fun sortColors(nums: IntArray): Unit {
[2,0,2,1,1,0]
