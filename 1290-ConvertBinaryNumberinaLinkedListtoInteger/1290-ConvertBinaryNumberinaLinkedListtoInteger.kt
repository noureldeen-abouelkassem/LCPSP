 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun getDecimalValue(head: ListNode?): Int {
        var result = 0
        var currentNode = head
        while (currentNode != null) {
            result *= 2
            result += currentNode.`val`
            currentNode = currentNode.next
        }
        return result

    }
[
