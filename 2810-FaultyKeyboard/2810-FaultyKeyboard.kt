class Solution {
    fun finalString(s: String): String = StringBuilder().apply {
    s.forEach { if (it == 'i') this.reverse() else this.append(it) }
}.toString()
}
"string"
