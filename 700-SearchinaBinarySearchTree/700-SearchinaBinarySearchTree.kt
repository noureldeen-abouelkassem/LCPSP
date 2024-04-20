        if (root == null) return null
        if (root.`val` == `val`) return root
        if(root.`val` > `val`) {
            println("greater")
            return searchBST(root?.left, `val`) 
        } else {
            println("greater2")
            return searchBST(root?.right, `val`)
        }
    }
}
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
[
