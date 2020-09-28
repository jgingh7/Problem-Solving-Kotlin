package treesEasy

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

//Bottom-Up
//Your runtime beats 100.00 % of kotlin submissions. O(n) - visiting each node recursively
//Your memory usage beats 8.79 % of kotlin submissions. O(n) - recursion stack
fun maxDepth(root: TreeNode?): Int {
    if (root == null) return 0
    return maxOf(maxDepth(root.left), maxDepth(root.right)) + 1 // find maximum of children and add 1
}

////Top-Bottom
////Your runtime beats 46.09 % of kotlin submissions.
////Your memory usage beats 94.44 % of kotlin submissions.
//fun maxDepth(root: TreeNode?): Int {
//    var maximum = 0
//
//    fun probe(node: TreeNode?, depth: Int) {
//        if (node == null) return // if node is null, end that stack
//        if (node.left == null && node.right == null) { // if a leaf is met, the maximum is the max of maximum (max from possibly other leaves) and depth + 1 (current leaf's depth)
//            maximum = maxOf(maximum, depth + 1)
//        }
//        probe(node.left, depth + 1) // probe down left side
//        probe(node.right, depth + 1) // probe down right side
//    }
//
//    probe(root, maximum) // start probing from top (root)
//    return maximum
//}