class Solution {
    fun kthDistinct(arr: Array<String>, k: Int): String {
        val map = LinkedHashMap<String, Int>()
        arr.forEach{
            map[it] = map.getOrDefault(it, 0) + 1
        }
        return map.filter { it.value == 1 }.keys.elementAtOrNull(k.dec()) ?: String()
    }
}