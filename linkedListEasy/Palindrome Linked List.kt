package linkedListEasy

fun main(args: Array<String>) {
    val li = ListNode(1)
    val li2 = ListNode(2)
    li.next = li2
    val li3 = ListNode(2)
    li2.next = li3
    val li4 = ListNode(1)
    li3.next = li4

    println(isPalindrome(li)) // true
}

//Your runtime beats 69.49 % of kotlin submissions. O(n)
//Space Complexity: O(1)
fun isPalindrome(head: ListNode?): Boolean {

    var slow = head
    var fast = head
    var fastPos = 0
    val slowPos: Int

    //         F  fastPos == 4
    // 1>2>2>1>null
    while (fast != null) {
        fast = fast.next
        fastPos++
    }
    //     S   slowPos == 2
    // 1>2>2>1
    slowPos = fastPos / 2 // fast goes 2 times further than slow
    for (i in 1..slowPos) {
        slow = slow?.next
    }

    //reverse the end half
    var prev: ListNode? = null
    while (slow != null) {
        val temp = slow.next
        slow.next = prev
        prev = slow
        slow = temp
    }
    slow = prev // put slow on prev (so that slow is not on null and on the end of the List)

    fast = head // put fast on the head of the List

    while (slow != null) { // come together to the middle on node at a time and compare
        if (slow.`val` != fast?.`val`) {
            return false
        }
        slow = slow.next
        fast = fast.next
    }

    return true

}


////Your runtime beats 19.49 % of kotlin submissions.
//fun isPalindrome(head: ListNode?): Boolean {
//
//    var slow = head
//    var fast = head
//    var fastPos = 0
//    val slowPos: Int
//
//    while (fast?.next != null) {
//        fast = fast?.next?.next
//        slow = slow?.next
//    }
//
//    var prev: ListNode? = null
//    while (slow != null) {
//        val temp = slow.next
//        slow.next = prev
//        prev = slow
//        slow = temp
//    }
//    slow = prev
//
//    fast = head
//
//    while (slow != null) {
//        if (slow.`val` != fast?.`val`) {
//            return false
//        }
//        slow = slow.next
//        fast = fast.next
//    }
//
//    return true
//
//}
