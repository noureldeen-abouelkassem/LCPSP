                }
                else -> {
                    if(nums[mid] == nums[mid-1])
                        low = mid+1
                    else
                        high = mid
                }
                
            }
        }
        return -1
    }
[
