        var highestNumber = 0
        candies.forEach {
            if (highestNumber < it)
                highestNumber = it
        }
        var list = mutableListOf<Boolean>()
        candies.forEach {
            if ((it + extraCandies) >= highestNumber) {
                list.add(true)
            } else {
                list.add(false)
            }
        }
        return list
    }
}
