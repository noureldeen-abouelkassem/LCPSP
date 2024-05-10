
    private fun node1Leafs(root: TreeNode?) {
    }
        return root1Leafs == root2Leafs
        node1Leafs(root1).also{ node2Leafs(root2) }
        if (root1 == null || root2 == null) return false
        if (root == null) return
        if (root.left == null && root.right == null)
            root1Leafs.addLast(root.`val`)
        node1Leafs(root.left).also { node1Leafs(root.right) }
    }

    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
    private var root2Leafs = ArrayDeque<Int>()
    private var root1Leafs = ArrayDeque<Int>()
class Solution {
 */
[
