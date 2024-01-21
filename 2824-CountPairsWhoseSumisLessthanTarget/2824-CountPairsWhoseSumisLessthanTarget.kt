
    private fun binarySearch(nums: List<Int>, element: Int, rightBound: Int): Int {
        var low = 0
        var high = rightBound
        var mid: Int
        while (low < high) {
            mid = ((low + high) / 2)
            if (nums[mid] >= element) {
                high = mid
            } else {
                low = mid + 1
            }
        }
        return low
    }
}
[
