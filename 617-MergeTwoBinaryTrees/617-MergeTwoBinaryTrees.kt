 */
class Solution {
    fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
        root1 ?: return root2 ?: return null
        root2 ?: return root1 ?: return null
    
    return root1.apply {
            `val` += root2.`val`
            left = mergeTrees(left, root2.left)
            right = mergeTrees(right, root2.right) 
        }
    }
}
[1,3,2,5]
