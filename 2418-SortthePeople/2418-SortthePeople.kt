class Solution {
    fun sortPeople(names: Array<String>, heights: IntArray): Array<String> = names
            .mapIndexed { index, name -> name to heights[index]}
            .sortedByDescending { it.second }
            .map { it.first }.toTypedArray()
}
[
