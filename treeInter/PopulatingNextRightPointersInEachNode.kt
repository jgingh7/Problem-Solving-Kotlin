package treeInter

class Node(var `val`: Int) {
    var left: Node? = null
    var right: Node? = null
    var next: Node? = null
}

//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    fun connect(root: Node?): Node? {
        var levelStart = root

        while (levelStart != null) {
            var curr = levelStart
            while (curr != null) {
                if (curr.left != null) {
                    curr.left!!.next = curr.right
                }
                if (curr.right != null && curr.next != null) {
                    curr.right!!.next = curr.next!!.left
                }
                curr = curr.next
            }
            levelStart = levelStart.left
        }
        return root
    }
}