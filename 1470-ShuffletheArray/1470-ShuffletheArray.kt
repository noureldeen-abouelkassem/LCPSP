            }
        }
        looper = 0
        for (i in 1 until nums.size step 2) {
            if (looper < secondSize) {
                result.removeAt(i)
                result.add(i,second[looper])
                looper++
            }
        }
        return result.toIntArray()
    }
}
                result.add(i,first[looper])
                looper++
                result.removeAt(i)
[
