 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun bstToGst(root: TreeNode?): TreeNode? {
        traverse(root, 0)
        return root
    }

    fun traverse(root: TreeNode?, sum: Int): Int {
        if (root == null) return sum

        root.`val` += traverse(root.right, sum)
        return traverse (root.left, root.`val`)
    } 
}
[
