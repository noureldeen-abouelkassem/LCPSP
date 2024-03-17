
        var first = nums.binarySearch(target, 0, nums.size)
        var last = first

        while (first >= 0) {
            result[0] = first
            first = nums.binarySearch(target, 0, first)
        }

        while (last >= 0) {
            result[1] = last
            last = nums.binarySearch(target, last + 1, nums.size)
        }

        return result
    }
[
