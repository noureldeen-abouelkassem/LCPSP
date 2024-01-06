class Solution {
    fun mostWordsFound(sentences: Array<String>): Int {
       var result =0 
        sentences.forEach { 
            it.split(" ").count().apply { 
                if (this > result) result = this
            }
        }
        return result 
    }
}
