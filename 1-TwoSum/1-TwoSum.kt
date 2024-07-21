                left + right == target -> return intArrayOf(nums.indexOfFirst{it == left}, nums.indexOfLast
{it == right})
                left + right > target -> rightPointer--
                left + right < target -> leftPointer++
            }
        }
        return intArrayOf()
    }
}
[2,7,11,15]
