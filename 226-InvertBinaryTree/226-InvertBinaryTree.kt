 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun invertTree(root: TreeNode?): TreeNode? =
        root?.apply {
            left = invertTree(rgt)
            right = invertTree(lft)
        }
 * Definition for a binary tree node.
 * var v = ti.`val`
 * var ti = TreeNode(5)
            var lft = left
            var rgt = right
[
