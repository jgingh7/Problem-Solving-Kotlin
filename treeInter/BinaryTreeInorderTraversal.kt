package treeInter

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

//Morris Traversal (Iterative)
//Your runtime beats 98.68 % of kotlin submissions. O(n) - To prove that the time complexity is O(n),
// the biggest problem lies in finding the time complexity of finding the predecessor nodes of all the nodes in the binary tree.
// Intuitively, the complexity is O(n log n), because to find the predecessor node for a single node related to the height of the tree.
// But in fact, finding the predecessor nodes for all nodes only needs O(n) time. Because a binary Tree with n nodes has n−1 edges, the whole processing for each edges up to 2 times,
// one is to locate a node, and the other is to find the predecessor node. So the complexity is O(n).
//
//Space complexity : O(n). Arraylist of size n is used.
// place all in order to the right and iterate
fun inorderTraversal(root: TreeNode?): List<Int> {
    val res = ArrayList<Int>()
    var curr = root

    while (curr != null) {
        if (curr.left == null) {
            res.add(curr.`val`)
            curr = curr.right
        } else { // curr.left != null // put curr on the right of the rightMost node of left subtree
            var rightMost = curr.left
            val nextTop = rightMost
            while (rightMost?.right != null) {
                rightMost = rightMost.right
            }
            rightMost?.right = curr
            curr.left = null // disconnect the line from curr to the top of the new tree
            curr = nextTop
        }
    }
    return res
}


////Recursive
////Your runtime beats 9.27 % of kotlin submissions. O(n) - the recursive function is T(n) = 2 ⋅ T(n/2) + 1
////Space complexity: O(n), and in the average case it's O(log n) where n is number of nodes.
//fun inorderTraversal(root: TreeNode?): List<Int> {
//    val res = ArrayList<Int>()
//    helper(root, res) // use helper since res needs to save values outside of recursion
//    return res
//}
//
//private fun helper(root: TreeNode?, res: ArrayList<Int>) {
//    if (root != null) { // end the function if the root is null
//        if (root.left != null) { // keep going left if root.left is not null
//            helper(root.left, res)
//        }
//        res.add(root.`val`) // when root.left is null, add the value of the current node
//        if (root.right != null) { // check the right for non-null nodes
//            helper(root.right, res)
//        }
//    }
//}
//
//
////Iterative
////Your runtime beats 73.51 % of kotlin submissions. O(n)
////Space complexity: O(n)
//fun inorderTraversal(root: TreeNode?): List<Int> {
//    val res = ArrayList<Int>()
//    val stack = ArrayDeque<TreeNode>() // temporary stacking
//    var curr = root
//    while (curr != null || stack.isNotEmpty()) { // if current node is null, and the stack is empty, there is no more nodes to traverse
//        while (curr != null) {
//            stack.add(curr) // push current node onto the stack, then move left (stacked value must be node so that curr.right can be performed)
//            curr = curr.left
//        }
//        curr = stack.removeLast() // if curr is null, popping from stack gives you the previous node
//        res.add(curr.`val`) // when root.left is null, add the value of the current node
//        curr = curr.right
//    }
//    return res
//}