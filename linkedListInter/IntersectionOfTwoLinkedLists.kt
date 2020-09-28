package linkedListInter

//Your runtime beats 84.68 % of kotlin submissions. O(m+n) - sum of the length of two nodes
//Space Complexity: O(1)
fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
    var a = headA
    var b = headB

    // think of this as traversing through one long list of headA + headB with two pointers
    // (A+C+B)+C and (B+C+A)+C -> the starting node of the last +C will be equal between the two pointers
    // here, C is the group of nodes shared
    // if we meet at null, means no intersection point at all
    while (a != b) { // this does not compare the value, but the actual node itself
        a = if (a == null) headB else a.next
        b = if (b == null) headA else b.next
    }
    return a
}