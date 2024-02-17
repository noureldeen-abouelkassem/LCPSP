 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        return head?.let {
            var size = 1
            var node :ListNode? = it
            while (node?.next!=null){
                node = node.next
                size++
            }
            node = head
            for (i in 0 until size.div(2)){
                node = node?.next
            }
            node
        }
    }
[1,2,3,4,5]
