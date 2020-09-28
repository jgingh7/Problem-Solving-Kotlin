package treeInter

// Time: O(n)
// Space: O(n)
fun preorderTraversal(root: TreeNode?): List<Int?>? {
    //go through left and go through right which are in order
    var curr = root
    val ans = ArrayList<Int?>()
    while (curr != null) {
        ans.add(curr.`val`)
        if (curr.left == null) {
            curr = curr.right
        } else {
            val nextTop = curr.left
            var rightMost = nextTop
            while (rightMost?.right != null) {
                rightMost = rightMost.right
            }
            rightMost?.right = curr.right
            curr = nextTop
        }
    }
    return ans
}