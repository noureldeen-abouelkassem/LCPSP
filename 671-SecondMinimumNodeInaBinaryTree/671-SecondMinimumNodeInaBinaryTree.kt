        if(root.`val` == root.left!!.`val`) 
            left = findSecondMinimumValue(root.left)
        if(root.`val` == root.right!!.`val`)
            right = findSecondMinimumValue(root.right)
        return if(left == -1)
        var right = root.right!!.`val`
        var left = root.left!!.`val`
        if (root.left == null && root.right == null) return -1
     if (root == null) return -1
    fun findSecondMinimumValue(root: TreeNode?): Int {
class Solution {
 */
            right
        else if(right == -1)
            left
        else
            minOf(left, right)   
[
