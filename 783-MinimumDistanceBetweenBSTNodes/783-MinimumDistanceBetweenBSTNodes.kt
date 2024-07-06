 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    var res = Int.MAX_VALUE
    var prev = -100000
    fun minDiffInBST(root: TreeNode?): Int {
        rec(root)
        return res
    }

    fun rec(node: TreeNode?) {
        if (node == null || res == -1) return
        rec(node.left)
        res = minOf(res, node.`val` - prev)
        prev = node.`val`
        rec(node.right)
    }
}
[
