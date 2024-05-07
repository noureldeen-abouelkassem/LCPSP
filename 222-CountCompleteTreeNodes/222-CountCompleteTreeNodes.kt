 * }
 */
class Solution {
    fun countNodes(root: TreeNode?): Int {
    var result = 0
        if (root == null) return 0
        countNodes(root?.left ?: null)
        return result
        result++
        countNodes(root?.right ?: null)
    }
}
[
