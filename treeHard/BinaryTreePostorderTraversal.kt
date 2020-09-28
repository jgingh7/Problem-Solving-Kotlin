package treeHard

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun postorderTraversal(root: TreeNode?): List<Int>? {
    var curr: TreeNode? = root
    val out: MutableList<Int> = ArrayList()
    if (curr == null) return out
    val dummy = TreeNode(-1)
    var pre: TreeNode? = null
    dummy.left = curr
    curr = dummy
    while (curr != null) {
        if (curr.left != null) {
            pre = curr.left
            while (pre?.right != null && pre.right !== curr) pre = pre.right
            if (pre?.right == null) {
                pre?.right = curr
                curr = curr.left
            } else {
                var node: TreeNode = pre
                reverse(curr.left!!, pre)
                while (node !== curr.left) {
                    out.add(node.`val`)
                    node = node.right!!
                }
                out.add(node.`val`) // Print again since we are stopping at node=root.left
                reverse(pre, curr.left!!)
                pre.right = null
                curr = curr.right
            }
        } else {
            curr = curr.right
        }
    }
    return out
}

fun reverse(from: TreeNode, to: TreeNode) {
    if (from === to) return
    var prev: TreeNode = from
    var node: TreeNode = from.right!!
    while (prev !== to) {
        val next: TreeNode = node.right!!
        node.right = prev
        prev = node
        node = next
    }
}