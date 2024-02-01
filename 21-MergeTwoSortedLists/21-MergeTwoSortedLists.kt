        }
        while (first != null) {
            val newNode = ListNode(first.`val`)
            resultTail.next = newNode
            resultTail = newNode
            first = first.next
        }
        while (second != null) {
            val newNode = ListNode(second.`val`)
            resultTail.next = newNode
            resultTail = newNode
            second = second.next
        }
        return result
    }
[
