/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun getMinimumDifference(root: TreeNode?): Int {
    }
    var res = Int.MAX_VALUE
    var prev = -1000000

    fun rec(node: TreeNode?){
        if(node == null || res == 1) return
    }
        rec(node?.left)
        res = minOf(res, Math.abs(node.`val` - prev))
        rec(node?.right)
        prev = node.`val`
        rec(root)
        return res
}
[4,2,6,1,3]
