class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        var slow = head
        var fast = head?.next
        if(head == null) return false
        while (fast != null && slow != fast) {
            slow = slow!!.next
            fast = fast.next?.next
        }
        return fast != null
    }
[
