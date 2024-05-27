            }
            prefix.add(numsHash.elementAt(i))
            takken[i] = true
            uniqueSet.add(numsHash.elementAt(i))
            result.addAll(permuteRec(numsHash, takken, prefix))
            takken[i] = false
            prefix.removeLast()
        }
        if (result.isEmpty()) {
            val newPrefixList = mutableListOf<Int>()
            newPrefixList.addAll(prefix)
                continue
        for (i in 0..<numsHash.size) {
            if (takken[i] || uniqueSet.contains(numsHash.elementAt(i))) {
        val result = mutableListOf<List<Int>>()
        val uniqueSet = HashSet<Int>()
    private fun permuteRec(numsHash: IntArray, takken: BooleanArray, prefix: MutableList<Int>): List<List<Int>> {
            result.add(newPrefixList)
        }
        return result
    }
}
[
