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
    fun inorderTraversal(root: TreeNode?): List<Int> {
        root?.let{
        return list
    val list = mutableListOf<Int>()
            inorderTraversal(root?.left)
        }
    }
            list.add(root.`val`)
            inorderTraversal(root?.right)
}
[
