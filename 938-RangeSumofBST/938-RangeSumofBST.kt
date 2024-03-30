    }

    private fun getALlNodes(tree: TreeNode, nodesInArray: ArrayList<Int>){
        nodesInArray.add(tree.`val`)
        tree.right?.let {
            getALlNodes(it, nodesInArray)
        }
        tree.left?.let {
            getALlNodes(it, nodesInArray)
        }
    }
}
[
