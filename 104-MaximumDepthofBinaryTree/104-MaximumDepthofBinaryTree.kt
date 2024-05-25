 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun maxDepth(root: TreeNode?): Int {
        if(root == null) return 0
    }
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 * Definition for a binary tree node.
 * var v = ti.`val`
        return maxOf(maxDepth(root.left), maxDepth(root.right)) + 1
}
[
