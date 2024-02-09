class Solution {
    fun sortSentence(s: String): String {
        val map = hashMapOf<Int, String>()
        for (i in 0..9) {
            map[i] = String()
        }
        s.split(" ").forEach {
            val string = it.split("[0-9]".toRegex()).getOrNull(0)
            val number = string?.let { it1 -> it.split(it1).getOrNull(1) }
            number?.let {
                map[number.toInt()] = string
            }
        }
        map.toSortedMap()
        val result = StringBuilder()
        map.forEach {
            result.append(it.value + " ")
        }
        return result.toString().trim()
    }
"is2 sentence4 This1 a3"
