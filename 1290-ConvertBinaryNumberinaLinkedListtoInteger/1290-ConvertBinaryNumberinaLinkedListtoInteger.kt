 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun getDecimalValue(head: ListNode?): Int {
        val bits = StringBuilder()
        var currentNode = head
        while (currentNode != null) {
            bits.append(currentNode.`val`)
            currentNode = currentNode.next
        }
        return bits.toString().toInt(2)
    }
[
