        var result = true
        if(root1Leafs.size != root2Leafs.size) return false
    private fun checkIdentical(root1Leafs: ArrayDeque<Int>, root2Leafs: ArrayDeque<Int>): Boolean {

    }
        return checkIdentical(root1Leafs, root2Leafs)
        root1Leafs.forEachIndexed { index, i -> 
            if(root2Leafs.getOrNull(index) != i)
                result = false
        }
        return result
        node1Leafs(root1).also{node2Leafs(root2)}
        if (root1 == null || root2 == null) return false
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
    private var root2Leafs = ArrayDeque<Int>()
    private var root1Leafs = ArrayDeque<Int>()
class Solution {
[
