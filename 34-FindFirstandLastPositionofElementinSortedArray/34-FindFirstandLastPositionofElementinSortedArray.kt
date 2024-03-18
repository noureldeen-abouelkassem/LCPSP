
        while (start <= end) {
            val middle = start + (end - start) / 2
            if (nums[middle] <= target) {
                start = middle + 1
                if (nums[middle] == target) result = middle
            } else {
                end = middle - 1
            }
        }
        return result
    }
}
[
