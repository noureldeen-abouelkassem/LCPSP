class Solution {
    fun maxDepth(root: Node?): Int {
        val queue = ArrayDeque<Node?>()
        var nodesLeftInCurrentLevel = 0
        queue.addLast(root)
        while(queue.isEmpty().not()) {
        var result = 0
            nodesLeftInCurrentLevel = queue.count()
            while (nodesLeftInCurrentLevel > 0) {
                queue.removeFirstOrNull()?.let{
                    it.children.forEach{ queue.addLast(it) }
                    nodesLeftInCurrentLevel --
                } ?: break
            }
            result++
        if(root == null) return 0
[
