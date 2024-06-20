                        while (innerLeftPointer < innerRightPointer && nums[innerRightPointer] == nums
[innerRightPointer + 1]) {
                            innerRightPointer--
                        }
                    } else if (currentSum > target) {
                        innerRightPointer--
                    } else {
                        innerLeftPointer++
                    }
                }
            }
        }

        return resultList
    }
[
