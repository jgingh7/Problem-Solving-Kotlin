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

    removeNthFromEnd(li, 4)
    printLinkedList(li) //1,2,3,5

}

//Your runtime beats 66.48 % of kotlin submissions. O(Length of List)
//Your memory usage beats 39.26 % of kotlin submissions. O(1)
fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    val temp = ListNode(0)
    temp.next = head // make a temp node that points to the head

    var fast: ListNode? = temp
    for(i in 1..n+1) { // place fast n steps ahead // this makes the final position of slow to be n steps behind fast
        fast = fast?.next
    }

    var slow: ListNode? = temp
    while(fast != null) { // end wen fast reaches null
        fast = fast.next
        slow = slow?.next
    }

    slow?.next = slow?.next?.next // delete null

    return temp.next
}

////Your runtime beats 87.50 % of kotlin submissions.
////Your memory usage beats 33.13 % of kotlin submissions.
//fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
//    val temp:ListNode?=ListNode(0)
//    temp?.next=head
//
//    var fast=temp
//    for(i in 1..n+1){
//        fast=fast?.next
//    }
//
//    var slow=temp
//    while(fast!=null){
//        fast=fast.next
//        slow=slow?.next
//    }
//
//    slow?.next=slow?.next?.next
//
//    return temp?.next
//}



