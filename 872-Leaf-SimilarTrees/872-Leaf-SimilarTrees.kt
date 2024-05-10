        if (root.left == null && root.right == null)
            root1Leafs.addLast(root.`val`)
        node1Leafs(root.left).also { node1Leafs(root.right) }
        if (root == null) return
    private fun node1Leafs(root: TreeNode?) {

    }

    private fun node2Leafs(root: TreeNode?) {
        if (root == null) return
        if (root.left == null && root.right == null)
            root2Leafs.addLast(root.`val`)
        node2Leafs(root.left).also { node2Leafs(root.right) }
    }
}
[
