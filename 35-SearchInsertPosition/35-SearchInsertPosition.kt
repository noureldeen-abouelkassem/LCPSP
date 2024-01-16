                nums[mid] > target -> last = mid - 1
                nums[mid] < target -> first = mid + 1
            }
        }
        first = 0
        last = nums.lastIndex
        if(target > nums.last()) return nums.lastIndex + 1
        if(target < nums.first()) return 0
        while (first <= last) {
            var mid = if (first == 0 && last == 0) 0 else (first + last) / 2
            when {
                nums[mid] == (target + 1) -> return mid
                nums[mid] == (target - 1) -> return mid + 1
                nums[mid] > target -> last = mid - 1
                nums[mid] < target -> first = mid + 1
            }
        }
        return -1
    }
}
[
