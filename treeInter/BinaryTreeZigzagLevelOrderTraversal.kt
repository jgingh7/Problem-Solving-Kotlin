package treeInter

//Your runtime beats 74.14 % of kotlin submissions. O(n)
//Space Complexity: O(n) - 2 stacks (ans and temp don't count, because they are memories for the answer)
fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
    val ans = mutableListOf<List<Int>>()
    if (root == null) return ans

    var curr = root
    val stackLToR = ArrayDeque<TreeNode>()
    val stackRToL = ArrayDeque<TreeNode>()

    stackLToR.add(curr)
    while (stackLToR.isNotEmpty() || stackRToL.isNotEmpty()) { // while there is something to process
        var temp = mutableListOf<Int>() // this ArrayList will be added to the final ArrayList as an element

        while (stackLToR.isNotEmpty()) { // while there are element to be counted from LtoR,
            curr = stackLToR.removeLast() // take currNode from the stack
            temp.add(curr.`val`) // add the removed value to temp
            if (curr.left != null) stackRToL.add(curr.left!!) // add left first because next line will be right to left, left being last (LIFO)
            if (curr.right != null) stackRToL.add(curr.right!!)
        }

        ans.add(temp)
        temp = mutableListOf() // cannot do "temp.clear()", because this will cause the added temp to be cleared

        while (stackRToL.isNotEmpty()) {
            curr = stackRToL.removeLast()
            temp.add(curr.`val`)
            if (curr.right != null) stackLToR.add(curr.right!!) // add right first because next line will be left to right, right being last (LIFO)
            if (curr.left != null) stackLToR.add(curr.left!!)
        }

        if (temp.isNotEmpty()) ans.add(temp) // if temp is Empty, do not add the temp
    }
    return ans
}


////Usage of "let"
////Your runtime beats 48.28 % of kotlin submissions.
//fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
//    val ans = ArrayList<ArrayList<Int>>()
//    if (root == null) return ans
//
//    var currNode: TreeNode?
//    val stackLToR = ArrayDeque<TreeNode>()
//    val stackRToL = ArrayDeque<TreeNode>()
//
//    stackLToR.add(root)
//    while (stackLToR.isNotEmpty() || stackRToL.isNotEmpty()) {
//        var temp = ArrayList<Int>()
//
//        while (stackLToR.isNotEmpty()) {
//            currNode = stackLToR.removeLast()
//            temp.add(currNode.`val`)
//            currNode.left?.let{ stackRToL.add(it) }
//            currNode.right?.let{ stackRToL.add(it) }
//        }
//
//        if (temp.isNotEmpty()) ans.add(temp)
//        temp = ArrayList()
//
//        while (stackRToL.isNotEmpty()) {
//            currNode = stackRToL.removeLast()
//            temp.add(currNode.`val`)
//            currNode.right?.let{ stackLToR.add(it) }
//            currNode.left?.let{ stackLToR.add(it) }
//        }
//
//        if (temp.isNotEmpty()) ans.add(temp)
//    }
//    return ans
//}