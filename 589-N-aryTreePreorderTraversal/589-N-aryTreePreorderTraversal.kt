class Solution {
    fun preorder(root: Node?): List<Int> {
        return root?.let {
            val result = mutableListOf<Int>()
            result.add(it.`val`)
            it.children.forEach { node ->
                result.addAll(preorder(node))
            }
            result
        } ?: emptyList()
    }
}
[
