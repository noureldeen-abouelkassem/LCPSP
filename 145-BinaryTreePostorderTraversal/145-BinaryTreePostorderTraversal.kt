class Solution {
    val list = mutableListOf<Int>()
    fun postorderTraversal(root: TreeNode?): List<Int> {
        list.addAll(
            if(root == null) 
                emptyList()
            else {
                postorderTraversal(root.left)
                postorderTraversal(root.right)
                listOf(root.`val`)
            }
        )
        return list
    }
}
[
