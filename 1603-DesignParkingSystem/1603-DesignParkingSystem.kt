            else -> {
            currentSlotsCount <= 0 -> return false

    fun addCar(carType: Int): Boolean {
        val currentSlotsCount = hashMap[carType]
        when{
            currentSlotsCount == null -> return false
                hashMap[carType] = currentSlotsCount.minus(1)
                return true
            }
        }
    }

}
[
