            accumlated
        }
        nums.foldRightIndexed(1) { index, acc, i ->
            val accumlated = acc * i
            suffix[index] = accumlated
            accumlated
        }
        nums.forEachIndexed { index, i ->
            val prefixInside = prefix.getOrNull(index.minus(1))
            val  suffixInside = suffix.getOrNull(index.plus(1))
            result[index] = (prefixInside ?: 1) * (suffixInside ?: 1)
        }
        return result
    }
}
[
