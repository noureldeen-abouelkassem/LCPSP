 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var children: List<Node?> = listOf()
 * }
 */

class Solution {
    fun postorder(root: Node?): List<Int> =  when (root) {
/**
        null -> emptyList()
        else -> root.children.flatMap { postorder(it) } + root.`val`
    }
}
[1,null,3,2,4,null,5,6]
