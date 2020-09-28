package linkedListEasy

fun main(args: Array<String>) {
    val li = ListNode(3)
    val li2 = ListNode(2)
    li.next = li2
    val li3 = ListNode(0)
    li2.next = li3
    val li4 = ListNode(4)
    li3.next = li4
    li4.next = li2
//    val li5 = ListNode(5)
//    li4.next = li5

    println(hasCycle(li))
}

//Your runtime beats 22.15 % of kotlin submissions. O(n)
// - depends on the list's length if non-cyclic
// - depends on the list' length and when the two pointers meet if cyclic
//Your memory usage beats 17.16 % of kotlin submissions. O(1)
fun hasCycle(head: ListNode?): Boolean {
    var fast = head?.next // takes care of when the List has <= 1 node
    var slow = head

    while (fast != null) { // if null is reached, it means there is no cycle
        fast = fast.next?.next
        slow = slow?.next
        if (fast == slow || fast?.next == slow) {
            return true
        }
    }
    return false
}