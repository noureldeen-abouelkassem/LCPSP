 * }
 */
class Solution {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        return buildTree(nums, 0, nums.size)
    }

    private fun buildTree(nums: IntArray, start: Int, end: Int): TreeNode? {
        if(start >= end) return null
        val mid = (start + end) / 2
        val node = TreeNode(nums[mid])
        node.left = buildTree(nums, start, mid)
        node.right = buildTree(nums, mid + 1, end)
        return node
    }
}
[
