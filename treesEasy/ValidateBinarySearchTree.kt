package treesEasy

//Your runtime beats 70.56 % of kotlin submissions. O(n)
//Space Complexity: O(n)
fun isValidBST(root: TreeNode?): Boolean {
    return isValidBST(root, null, null)
}

private fun isValidBST (node: TreeNode?, lower: Int?, upper: Int?): Boolean {
    if (node == null) return true // a child of null returns true

    val currVal = node.`val`

    // if there is a lower bound, and the value of the node is smaller
    // or if there is an upper bound, and the value of the node is bigger, return false
    if ((lower != null && currVal <= lower) || upper != null && currVal >= upper) return false

    // check if the left node and the right node has valid subtrees
    return isValidBST(node.left, lower, currVal) && isValidBST(node.right, currVal, upper)
}