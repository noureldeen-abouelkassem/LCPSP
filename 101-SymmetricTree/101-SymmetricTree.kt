 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        return isSymmetric(root?.left, root?.right)
    }

    private fun isSymmetric(tree1: TreeNode?, tree2: TreeNode?): Boolean {
        return when {
            tree1 == null || tree2 == null -> tree1 == tree2
            tree1.`val` != tree2.`val` -> false
            else -> isSymmetric(tree1.left, tree2.right) && isSymmetric(tree2.left, tree1.right)
        }
    }
}
[
 