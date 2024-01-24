        var indexCounter = 0
        for (c in stringOfBinaryRepresentation) {
            when (c) {
                '/' -> {
                    hashMapOfIndexAndBitCount[indexCounter] = counter
                    indexCounter++
                    counter = 0
                }

                '1' -> counter++
            }
        }
        hashMapOfIndexAndBitCount.forEach { (t, u) ->
            if(u == k){
                println(nums[t])
                result += nums[t]
            }
        }
        return result
    }
[
