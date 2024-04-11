class Solution {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        var left = 0
        var right = arr.size - 1
        while(left <= right){
            val cur = left + (right - left) / 2
            if(arr[cur] > arr[cur + 1] && arr[cur] > arr[cur - 1]) return cur
            if(arr[cur] > arr[cur + 1])
                right = cur -1
            else 
                left = cur + 1
        }
        return -1
    }
}
[0,1,0]
