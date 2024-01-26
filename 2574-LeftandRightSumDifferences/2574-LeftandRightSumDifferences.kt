            rightSum.add(numsSum - nums[i])
            numsSum -= nums[i]
        }
        numsSum = nums.sum()
        leftSum.addAll(nums.toList())
        for (i in nums.lastIndex downTo 0) {
            leftSum.removeAt(i)
            leftSum.add(i, numsSum - nums[i])
            numsSum -= nums[i]
        }
        nums.forEachIndexed { index, i ->
            answer.add(Math.abs(leftSum[index] - rightSum[index]))
        }
        return answer.toIntArray()
    }
}
[
