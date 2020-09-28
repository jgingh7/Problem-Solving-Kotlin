package treesEasy

//BFS algorithm
//Your runtime beats 46.77 % of kotlin submissions. O(n^2)
//Your memory usage beats 76.51 % of kotlin submissions.
// - O(n) for usage of queue, but if tree was a linked list, O(1) constant add and deque of 1 element
fun levelOrder(root: TreeNode?): List<List<Int>> {
    val outerList = arrayListOf<List<Int>>()
    val q = arrayListOf<TreeNode?>()
    q.add(root)

    while (q.isNotEmpty()) {
        val currLevelNumOfNodes = q.size
        val innerList = arrayListOf<Int>()
        for (i in 0 until currLevelNumOfNodes) {
            val currNode = q.removeAt(0)
            if (currNode == null) { // only enters when tree is null, because other nodes are not added to queue if null
                return outerList // returns empty list when tree is null
            } else{
                innerList.add(currNode.`val`)
            }

            if (currNode.left != null) { // if left node is null, it is not added to the queue
                q.add(currNode.left)
            }
            if (currNode.right != null) { // if right node is null, it is not added to the queue
                q.add(currNode.right)
            }
        }
        outerList.add(innerList) // can add an arrayList, because arrayList is a type of List
    }
    return outerList // can return an arrayList, because arrayList is a type of List
}

////Your runtime beats 98.39 % of kotlin submissions.
////Your memory usage beats 20.45 % of kotlin submissions.
//fun levelOrder(root: TreeNode?): List<List<Int>> {
//    var res = listOf<List<Int>>()
//    val q = arrayListOf<TreeNode?>()
//    q.add(root)
//
//    val outerList = arrayListOf<List<Int>>()
//    while (q.isNotEmpty()) {
//        val currLevelNumOfNodes = q.size
//        val innerList = arrayListOf<Int>()
//        for (i in 0 until currLevelNumOfNodes) {
//            val currNode = q.removeAt(0)
//            if (currNode == null) { // only enters when tree is null, because other nodes are not added to queue if null
//                return res // returns empty list when tree is null
//            } else{
//                innerList.add(currNode.`val`)
//            }
//
//            if (currNode.left != null) { // if left node is null, it is not added to the queue
//                q.add(currNode.left)
//            }
//            if (currNode.right != null) { // if right node is null, it is not added to the queue
//                q.add(currNode.right)
//            }
//        }
//        outerList.add(innerList)
//    }
//    res = outerList.toList()
//    return res
//}
//
//
////Your runtime beats 98.39 % of kotlin submissions.
////Your memory usage beats 20.45 % of kotlin submissions.
//fun levelOrder(root: TreeNode?): List<List<Int>> {
//    var res = listOf<List<Int>>()
//    val q = arrayListOf<TreeNode?>()
//    q.add(root)
//
//    val outerList = arrayListOf<List<Int>>()
//    while (q.isNotEmpty()) {
//        val currLevelNumOfNodes = q.size
//        val innerList = arrayListOf<Int>()
//        for (i in 0 until currLevelNumOfNodes) {
//            val currNode = q.removeAt(0)
//            if (currNode == null) { // only enters when tree is null, because other nodes are not added to queue if null
//                return res // returns empty list when tree is null
//            } else{
//                innerList.add(currNode.`val`)
//            }
//
//            if (currNode.left != null) { // if left node is null, it is not added to the queue
//                q.add(currNode.left)
//            }
//            if (currNode.right != null) { // if right node is null, it is not added to the queue
//                q.add(currNode.right)
//            }
//        }
//        outerList.add(innerList)
//    }
//    res = outerList.toList()
//    return res
//}
//

////Your runtime beats 46.77 % of kotlin submissions.
////Your memory usage beats 19.69 % of kotlin submissions.
//fun levelOrder(root: TreeNode?): List<List<Int>> {
//    var res = listOf<List<Int>>()
//    if (root == null) return res
//
//    val q = arrayListOf<TreeNode?>()
//    q.add(root)
//
//    val outerList = arrayListOf<List<Int>>()
//    while (q.isNotEmpty()) {
//        val currLevelNumOfNodes = q.size
//        val innerList = arrayListOf<Int>()
//        for (i in 0 until currLevelNumOfNodes) {
//            val currNode = q.removeAt(0)
//            if (currNode == null) { // only enters when tree is null, because other nodes are not added to queue if null
//                continue // skip the iteration instance // this is never reached because of "if (root == null) return res", but is needed to keep return value of List<List<Int>> instead of List<List<Int?>>
//            } else{
//                innerList.add(currNode.`val`)
//            }
//
//            if (currNode.left != null) { // if left node is null, it is not added to the queue
//                q.add(currNode.left)
//            }
//            if (currNode.right != null) { // if right node is null, it is not added to the queue
//                q.add(currNode.right)
//            }
//        }
//        outerList.add(innerList)
//    }
//    res = outerList.toList()
//    return res
//}
//
////Your runtime beats 46.77 % of kotlin submissions.
////Your memory usage beats 20.45 % of kotlin submissions.
//fun levelOrder(root: TreeNode?): List<List<Int>> {
//    var res = listOf<List<Int>>()
//    if (root == null) return res
//    if (root.left == null && root.right == null) {
//        return listOf(listOf(root.`val`))
//    }
//
//    val q = arrayListOf<TreeNode?>()
//    q.add(root)
//
//    val outerList = arrayListOf<List<Int>>()
//
//    while (q.isNotEmpty()) {
//        val currLevelNumOfNodes = q.size
//        val innerList = arrayListOf<Int>()
//        for (i in 0 until currLevelNumOfNodes) {
//            val currNode = q.removeAt(0)
//            if (currNode == null) {
//                continue
//            } else{
//                innerList.add(currNode.`val`)
//            }
//
//            if (currNode.left != null) {
//                q.add(currNode.left)
//            }
//            if (currNode.right != null) {
//                q.add(currNode.right)
//            }
//        }
//        outerList.add(innerList)
//    }
//
//    res = outerList.toList()
//
//    return res
//}