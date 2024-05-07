 * }
 */
class Solution {
    fun countNodes(root: TreeNode?): Int {
    var result = 0
        if (root == null) return 0
        countNodes(root?.left ?: null).also{ countNodes(root?.right ?: null) }
        return result
        result++
    }
}
 *     var right: TreeNode? = null
[
