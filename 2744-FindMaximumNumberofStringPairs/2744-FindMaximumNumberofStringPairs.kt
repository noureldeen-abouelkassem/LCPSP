    fun maximumNumberOfStringPairs(words: Array<String>): Int {
        val hashMap = hashMapOf<String,Int>()
        var count = 0
        for(word in words) {
            if(hashMap.containsKey(word.reversed())) {
                count++
            } else {
                hashMap[word] = 0
            }
        }
        return count
}
[
