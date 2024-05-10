    }
        return checkIdentical(root1Leafs, root2Leafs)
        node2Leafs(root2)
        node1Leafs(root1)

    private fun checkIdentical(root1Leafs: ArrayDeque<Int>, root2Leafs: ArrayDeque<Int>): Boolean {
        var result = true
        root1Leafs.forEachIndexed { index, i -> 
            if(root2Leafs.getOrNull(index) != i)
                result = false
        }
        return result
    }

    private fun node1Leafs(root: TreeNode?) {
        if (root == null) return
        if(root1Leafs.size != root2Leafs.size) return false
[
