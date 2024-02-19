class Solution {
    fun sumOddLengthSubarrays(arr: IntArray): Int {
       var result = 0
        for (i in 1..arr.size step 2)
            result += arr.toList().windowed(i).flatten().sum()
        return result
    }
}
[1,4,2,5,3]
