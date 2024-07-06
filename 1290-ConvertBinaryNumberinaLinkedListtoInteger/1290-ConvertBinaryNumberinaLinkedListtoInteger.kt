/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun getDecimalValue(head: ListNode?): Int {
        val stringBuilder = StringBuilder()
        var current = head
        while(current != null){
        }
    }
            stringBuilder.append(current.`val`.toString())
        return stringBuilder.toString().toInt(2)
            current = current.next
}
[
