
    private fun numWaterBottles(numBottles: Int, numExchange: Int, numEmpty: Int): Int {
        return if ((numBottles + numEmpty) < numExchange) {
            numBottles
        } else {
            numBottles + numWaterBottles(
                (numBottles + numEmpty).div(numExchange),
                numExchange,
                (numBottles + numEmpty).mod(numExchange)
            )
        }
    }
    }
        return numWaterBottles(numBottles, numExchange, 0)
9
