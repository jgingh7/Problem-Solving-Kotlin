package linkedListEasy

fun main(args: Array<String>) {
    val li = ListNode(1)
    val li2 = ListNode(2)
    li.next = li2
    val li3 = ListNode(4)
    li2.next = li3
//    val li4 = ListNode(4)
//    li3.next = li4
//    val li5 = ListNode(5)
//    li4.next = li5

    val li21 = ListNode(1)
    val li22 = ListNode(3)
    li21.next = li22
    val li23 = ListNode(4)
    li22.next = li23
//    val li24 = ListNode(4)
//    li23.next = li24
//    val li25 = ListNode(5)
//    li24.next = li25

    printLinkedList(mergeTwoLists(li, li21)) // 1,1,2,3,4,4
}

//Your runtime beats 64.18 % of kotlin submissions. O(n+m)
//Your memory usage beats 39.63 % of kotlin submissions. O(1)
fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    val prevOfStartHead: ListNode? = ListNode(0) // a null cannot have a next node, but it can be a next of a node
    var prev = prevOfStartHead

    var l1Curr = l1
    var l2Curr = l2
    while(l1Curr != null || l2Curr != null) {
        if(l1Curr == null) { prev?.next = l2Curr; break } // if l1Curr is null, the next curr is l2Curr and end
        if(l2Curr == null) { prev?.next = l1Curr; break } // if l2Curr is null, the next curr is l1Curr and end

        if(l1Curr.`val` < l2Curr.`val`) { // if value of l1Curr is smaller, the next curr is l1Curr, and increment the l1Curr
            prev?.next = l1Curr
            l1Curr = l1Curr.next
        } else { // if value of l2Curr is smaller or same, the next curr is l2Curr, and increment the l2Curr
            prev?.next = l2Curr
            l2Curr = l2Curr.next
        }

        prev = prev?.next // move the prev to previous curr
    }

    return prevOfStartHead?.next
}



////Your runtime beats 52.44 % of kotlin submissions. O(n+m)
////Your memory usage beats 40.25 % of kotlin submissions. O(1)
//fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
//    if (l1 == null && l2 == null) return null
//    if (l1 == null) return l2
//    if (l2 == null) return l1
//
//    var prev: ListNode? = ListNode(0)
//    var l1Curr = l1
//    var l2Curr = l2
//    var isOnl1: Boolean
//
//    val startHead: ListNode?
//    if (l1.`val` < l2.`val`) {
//        startHead = l1
//        prev?.next = l1
//        isOnl1 = true
//    } else {
//        startHead = l2
//        prev?.next = l2
//        isOnl1 = false
//    }
//
//    while (l1Curr != null || l2Curr != null) {
//        if (isOnl1) {
//            if (l1Curr!!.`val` <= l2Curr!!.`val`) {
//                prev = prev?.next
//                l1Curr = l1Curr.next
//                if (l1Curr == null) {
//                    prev?.next = l2Curr
//                    break
//                }
//            } else { // l1Curr.`val` > l2Curr.`val`
//                prev?.next = l2Curr
//                isOnl1 = false
//            }
//        } else { // isOnl2
//            if (l2Curr!!.`val` <= l1Curr!!.`val`) {
//                prev = prev?.next
//                l2Curr = l2Curr.next
//                if (l2Curr == null) {
//                    prev?.next = l1Curr
//                    break
//                }
//            } else { // l2Curr.`val` > l1Curr.`val`
//                prev?.next = l1Curr
//                isOnl1 = true
//            }
//        }
//    }
//
//    return startHead
//}