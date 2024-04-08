        var end = nums.lastIndex
        while (start <= end) {
            val middle = start + (end - start) / 2
            when {
                nums[middle] == target -> return middle
                nums[middle] > target -> end = middle - 1
                nums[middle] < target -> start = middle + 1
            }
        }
        return -1
    }
}
[4,5,6,7,0,1,2]
