    private fun findLastOccurrence(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.size - 1
        var result = -1

        while (start <= end) {
            val middle = start + (end - start) / 2
            if (nums[middle] <= target) {
                start = middle + 1
            } else {
                end = middle - 1
            }
        }
        return result
    }
            if (nums[middle] == target) result = middle
}
[
