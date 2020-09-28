import treesEasy.TreeNode

fun kthSmallest(root: TreeNode?, k: Int): Int {
    var curr = root
    var kthValue = k
    val stack = ArrayDeque<TreeNode>()
    while (true) {
        while (curr != null) {
            stack.add(curr)
            curr = curr.left
        }
        curr = stack.removeLast()
        kthValue--
        if (kthValue == 0) return curr.`val`
        curr = curr.right
    }
}
