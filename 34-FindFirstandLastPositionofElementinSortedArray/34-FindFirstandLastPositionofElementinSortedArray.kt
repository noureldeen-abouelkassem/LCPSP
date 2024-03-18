        var result = -1

        while (start <= end) {
            val middle = start + (end - start) / 2
            if (nums[middle] == target) result = middle
            if (nums[middle] < target) {
                start = middle + 1
            } else {
                end = middle - 1
            }
        }
        return result
    }
        var end = nums.size - 1
        var start = 0
    private fun findLastOccurrence(nums: IntArray, target: Int): Int {

[
