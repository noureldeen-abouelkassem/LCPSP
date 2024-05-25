 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun minDiffInBST(root: TreeNode?): Int {
        var res = Int.MAX_VALUE
        var prev = -100000
        fun dfs(node: TreeNode?) {
            if (node == null || res == 1) return
            dfs(node.left)
            res = minOf(res, node.`val` - prev)
            prev = node.`val`
            dfs(node.right)
        }
        dfs(root)
        return res
    }
}
[
