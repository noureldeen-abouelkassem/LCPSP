}
/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun binaryTreePaths(root: TreeNode?): List<String> =
        when {
            root == null -> listOf()
            root.left == null && root.right == null -> listOf("${root.`val`}")
            else -> (binaryTreePaths(root.left) + binaryTreePaths(root.right)).map { "${root.`val`}->$it" }
        }
[
