package treesEasy

//Your runtime beats 83.57 % of kotlin submissions. O(n)
//Your memory usage beats 25.16 % of kotlin submissions. O(n)
fun isSymmetric(root: TreeNode?): Boolean {
    if (root == null) return true // root is null, return true
    return isSymmetric(root.left, root.right) // check if left and right is symmetric
}

fun isSymmetric (left: TreeNode?, right: TreeNode?): Boolean {
    if (left == null && right == null) return true // if just both left and right are null, is symmetric
    if (left?.`val` != right?.`val`) return false // if their values are not same (also if just one of them is null), not symmetric
    return isSymmetric(left?.left, right?.right) && isSymmetric(left?.right, right?.left) // check left's left and right's right for symmetricity, and left's right and right's left for symmetricity
}

////BFS algorithm
////Your runtime beats 57.28 % of kotlin submissions. O(n)
////Your memory usage beats 8.61 % of kotlin submissions. O(n) for the arrayList
//fun isSymmetric(root: TreeNode?): Boolean {
//    val q = arrayListOf<TreeNode?>()
//    q.add(root?.left)
//    q.add(root?.right)
//
//    while (q.isNotEmpty()) {
//        val tempLeft = q.removeAt(0) // remove element of the queue
//        val tempRight = q.removeAt(0)
//
//        if (tempLeft == null && tempRight == null) {
//            continue
//        }
//        if (tempLeft == null || tempRight == null) { // if just one is null, is not Symmetric
//            return false
//        }
//        if (tempLeft.`val` != tempRight.`val`) { // if their values are not same, is not Symmetric
//            return false
//        }
//        q.add(tempLeft.left)
//        q.add(tempRight.right) // the need-to-be-symmetrical nodes will be compared at next iteration
//        q.add(tempLeft.right)
//        q.add(tempRight.left) // the need-to-be-symmetrical nodes will be compared at next iteration
//    }
//    return true
//}