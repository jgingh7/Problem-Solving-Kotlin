package linkedListInter

//Your runtime beats 100.00 % of kotlin submissions. O(n) - There are total nn nodes and we visit each node once.
//Space complexity : O(1) All we need is the four pointers.
fun oddEvenList(head: ListNode?): ListNode? {
    var odds = head
    val starter = head?.next
    var evens = starter

    while (evens?.next != null) {
        odds?.next = odds?.next?.next
        odds = odds?.next
        evens.next = evens.next?.next
        evens = evens.next
    }
    odds?.next = starter

    return head
}