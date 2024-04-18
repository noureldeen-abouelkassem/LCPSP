            node.right?.let {
                queue.addLast(it)
                listOfValues.add(it.`val`)
            }
            node = queue.removeFirstOrNull()
        }
        listOfValues.sort()
        var nodeBuilder = TreeNode(listOfValues.removeFirst())
        val rootResult = nodeBuilder
        listOfValues.forEach {
            nodeBuilder.left = null
            nodeBuilder.right = TreeNode(it)
            nodeBuilder = nodeBuilder.right!!
        }
        return rootResult
    }
[
