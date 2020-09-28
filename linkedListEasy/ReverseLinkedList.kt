package linkedListEasy

fun main(args: Array<String>) {
    var li = ListNode(1)
    var li2 = ListNode(2)
    li.next = li2
    var li3 = ListNode(3)
    li2.next = li3
    var li4 = ListNode(4)
    li3.next = li4
    var li5 = ListNode(5)
    li4.next = li5

    printLinkedList(reverseList(li)) //5,4,3,2,1
}

//Your runtime beats 40.68 % of kotlin submissions. O(n) - n is list length
//Your memory usage beats 31.01 % of kotlin submissions. O(1)
fun reverseList(head: ListNode?): ListNode? {
    var prev: ListNode? = null // the end point should point to null
    var curr = head

    while (curr != null) {
        val nextTemp = curr.next // assign curr.next value to variable nextTemp
        curr.next = prev // change curr.next to previous node
        prev = curr // change prev to curr
        curr = nextTemp // like curr = curr.next
    }
    return prev
}

////Recursive
////Your runtime beats 40.68 % of kotlin submissions. O(n)
////Your memory usage beats 31.01 % of kotlin submissions. O(n) - recursion stack
//fun reverseList(head: ListNode?): ListNode? {
//
//    if (head?.next == null) { //head == null || head.next == null
//        return head
//    }
//    val p = reverseList(head.next) //the nodes closer to tail are already in inverse
//    head.next?.next = head // if (1->2->3->4<-5), 3's next's next, which is 4's next is now 3
//    head.next = null // if this is not done, it becomes (1->2->3<->4<-5)
//    return p
//}
//
//
////Your runtime beats 25.08 % of kotlin submissions.
////Your memory usage beats 41.08 % of kotlin submissions.
//fun reverseList(head: ListNode?): ListNode? {
//
//    if (head == null || head.next == null) {
//        return head
//    }
//    val p = reverseList(head.next)
//    head.next?.next = head
//    head.next = null
//    return p
//}

