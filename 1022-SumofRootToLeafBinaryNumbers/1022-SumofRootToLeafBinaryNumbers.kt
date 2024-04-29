    }
        return res
    
    fun traverse(node: TreeNode?, curSum:Int) {
        if (node == null) return
        var curSum = (curSum shl 1) or node.`val`
        if (node.left == null && node.right == null) res += curSum
        traverse(node.left, curSum)
        traverse(node.right, curSum)
        traverse(root, 0)
    fun sumRootToLeaf(root: TreeNode?): Int {
    var res = 0
class Solution {
 */
 * }
 *     var right: TreeNode? = null
[
