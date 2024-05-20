class Solution {
    var list = mutableListOf<Int>()
    fun preorderTraversal(root: TreeNode?): List<Int> {
        root?.let { list.add(it.`val`) }
        root?.left?.let { 
            preorderTraversal(it)
        }
        root?.right?.let {
            preorderTraversal(it)
        }
        return list
    }
}
[
