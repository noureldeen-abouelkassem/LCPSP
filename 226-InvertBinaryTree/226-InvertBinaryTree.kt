            queue.addLast(root)
            var node = queue.removeFirstOrNull()
            val queue = ArrayDeque<TreeNode>()
            val result = node
            while (node != null) {
                node.left?.let { queue.addLast(it) }
        return root?.let {
    fun invertTree(root: TreeNode?): TreeNode? {
class Solution {
                node.right?.let { queue.addLast(it) }
                val left = node.left
                val right = node.right
                node.right = left
                node.left = right
                node = queue.removeFirstOrNull()
            }
[
