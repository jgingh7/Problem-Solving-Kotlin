package linkedListEasy

var li = ListNode(5)
var v = li.`val`

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

//Your runtime beats 60.67 % of kotlin submissions. O(1)
//Your memory usage beats 63.60 % of kotlin submissions. O(1)
fun deleteNode(node: ListNode?) {
    node?.`val` = node?.next?.`val`!!
    node.next = node.next?.next
}

////Your runtime beats 5.00 % of kotlin submissions.
////Your memory usage beats 12.87 % of kotlin submissions.
//fun deleteNode(node: ListNode?) {
//    val temp = node!!.next
//    node.`val` = temp!!.`val`
//    node.next = temp.next
//}

////Your runtime beats 5.00 % of kotlin submissions. O(1)
////Your memory usage beats 95.22 % of kotlin submissions. O(1)
//fun deleteNode(node: ListNode?) {
//    val temp = node!!.next
//    node.`val` = temp!!.`val`
//    node.next = temp.next
//    temp.next = null // not needed
//}
// Kotlin works on JVM so that means that it comes with a garbage collector.
// Garbage collector automatically collects unused objects in the heap
// on a condition that they can not be reached anymore by any object(not counting weak/soft references)


fun printLinkedList (head: ListNode?) {
    var curr = head
    while (curr != null) {
        print("${curr.`val`}, ")
        curr = curr.next
    }
}