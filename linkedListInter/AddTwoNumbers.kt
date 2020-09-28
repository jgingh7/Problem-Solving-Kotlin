package linkedListInter

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

//Your runtime beats 31.52 % of kotlin submissions. O(max(m,n))
// - Assume that m and n represents the length of l1 and l2 respectively, the algorithm above iterates at most max(m, n) times.
//Space complexity : O(max(m,n))
// - The length of the new list is at most max(m, n) + 1.
fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    if (l1 == null && l2 == null) return null // not needed, but added for speed

    var currNode = ListNode(0)
    val res = currNode // will return res.next
    var add10 = 0
    var nodeL1 = l1
    var nodeL2 = l2

    while (nodeL1 != null || nodeL2 != null) {
        val currNum1 = nodeL1?.`val`
        val currNum2 = nodeL2?.`val`
        val temp = ListNode(0) // this will have the value to be added, and put on currNode
        val tempSum: Int

        tempSum =
                if (currNum1 == null && currNum2 != null) currNum2 + add10 // if currNum1 is null, just add currNum2 and add10
                else if (currNum2 == null && currNum1 != null) currNum1 + add10
                else currNum1!! + currNum2!! + add10

        if (tempSum < 10) { // if sum is less than 10, just add the sum
            temp.`val` = tempSum
            add10 = 0
        } else { // tempSum >= 10, add the remainder when divided by 10 // add10 becomes 1
            temp.`val` = tempSum % 10
            add10 = 1
        }
        currNode.next = temp
        currNode = currNode.next!!
        nodeL1 = nodeL1?.next
        nodeL2 = nodeL2?.next
    }

    if (add10 == 1) { // if there remains an add10 at the end, add 1 at the last
        currNode.next = ListNode(1)
    }

    return res.next
}