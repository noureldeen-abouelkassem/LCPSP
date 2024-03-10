        flippedImage.forEachIndexed { index, row ->
            flippedImage[index] = row.map { number ->
                when (number) {
                    0 -> 1
                    else -> number
                }
            }.toIntArray()
        }
                    1 -> 0
        image.forEach {
            flippedImage.add(it.reversed().toIntArray())
        }
        val flippedImage = mutableListOf<IntArray>()
        return flippedImage.toTypedArray()
    }
}
[
