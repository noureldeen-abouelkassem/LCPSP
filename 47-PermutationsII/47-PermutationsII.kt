        for (i in numsHash.keys) {
            if (numsHash[i] == 0) {
                continue
            }
            prefix.add(i)
            numsHash[i] = numsHash.getOrDefault(i, 1).minus(1)
        val result = mutableListOf<List<Int>>()
    private fun permuteRec(numsHash: HashMap<Int, Int>, prefix: MutableList<Int>): List<List<Int>> {

    }
        return permuteRec(hashMap, mutableListOf())
        }
            result.addAll(permuteRec(numsHash, prefix))
            numsHash[i] = numsHash.getOrDefault(i, 0).plus(1)
            prefix.removeLast()
        }
        if (result.isEmpty()) {
            val newPrefixList = mutableListOf<Int>()
            newPrefixList.addAll(prefix)
            result.add(newPrefixList)
        }
        return result
[
