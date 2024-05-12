        }
    }

    private fun sumOfAllElements(root: TreeNode): Int {
        var sum = 0
        sum += root.`val`
        if (root.left != null) {
            sum += sumOfAllElements(root.left!!)
        }
        if (root.right != null) {
            sum += sumOfAllElements(root.right!!)
        }
        return sum
    }
}
[1,2,3]
