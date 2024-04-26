                1 -> true
                2 -> evaluateTree(root.left) || evaluateTree(root.right)
                3 -> evaluateTree(root.left) && evaluateTree(root.right)
                else -> false
            }
        } ?: false
    }
}
[
