                nums[middle] > target -> {
                    end = middle.minus(1)
                }

                else -> {
                    start = middle.plus(1)
                }
            }
        }
        return start
    }
}
[
