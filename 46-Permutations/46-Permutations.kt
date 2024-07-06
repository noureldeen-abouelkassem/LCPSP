            takken[i] = false
        for (i in 0..<numsHash.size) {
            if (takken[i]) {
                continue
            }
            prefix.add(numsHash.elementAt(i))
            takken[i] = true
            result.addAll(permuteRec(numsHash, takken, prefix))
            prefix.remove(numsHash.elementAt(i))
        val result = mutableListOf<List<Int>>()
    private fun permuteRec(numsHash: HashSet<Int>, takken: BooleanArray, prefix: MutableList<Int>): List<List<Int>> {

    }
        }
        if (result.size == 0) {
            val newPrefixList = mutableListOf<Int>()
            newPrefixList.addAll(prefix)
            result.add(newPrefixList)
        }
        return result
    }
}
[
