    fun findMin(nums: IntArray): Int {
        var index = 0
        if(nums.first()>nums.last()) {
            var minimum = Integer.MIN_VALUE
            while (nums[index] > minimum) {
                minimum = nums[index]
                index++
            }
            nums[index]
        }
        return nums[index]
    }
[
