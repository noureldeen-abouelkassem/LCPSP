 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p==null && q==null) return true
        if (p==null && q!=null || p!=null && q==null) return false
        if (p!!.`val` != q!!.`val`) return false
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
        if (p.left==null && q.left!=null || p.left!=null && q.left==null) return false
        if (p.right==null && q.right!=null || p.right!=null && q.right==null) return false
        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right))
    }
}
  [


