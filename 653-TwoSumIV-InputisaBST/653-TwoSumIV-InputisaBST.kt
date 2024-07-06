 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    val set = mutableSetOf<Int>()
    fun findTarget(root: TreeNode?, k: Int): Boolean {
        return inOrderTraversal(root, k)
    }

    private fun inOrderTraversal(root: TreeNode?, k: Int) : Boolean {
        if(inOrderTraversal(root.left, k)) return true
        set.add(root.`val`)
        return inOrderTraversal(root.right, k)
    }
 * Example:
        root ?: return false
        root ?: return false
        if(set.contains(k - root.`val`)) return true
}
[
