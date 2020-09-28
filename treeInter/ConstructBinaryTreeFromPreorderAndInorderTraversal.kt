package treeInter

import kotlin.collections.HashMap

//Time Complexity: O(n)
//Space Complexity: O(n)
fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
    val inMap = HashMap<Int, Int>()
    for (i in inorder.indices) {
        inMap[inorder[i]] = i
    }
    return helper(preorder, 0, 0, inorder.size - 1, inMap)
}

fun helper(preorder: IntArray, preStart: Int, inStart: Int, inEnd: Int, map: HashMap<Int, Int>): TreeNode? {
    if (inStart > inEnd) return null
    val rootVal = preorder[preStart]
    val root = TreeNode(rootVal)
    val inRootIdx = map[rootVal]!!

    root.left = helper(preorder, preStart + 1, inStart, inRootIdx - 1, map)
    root.right = helper(preorder, preStart + (inRootIdx - inStart) + 1, inRootIdx + 1, inEnd, map)
                                       // this is jumping over the left nodes that were traversed
    return root
}

////Time Complexity: O(nlogn)
////Space Complexity: O(1)
//fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
//    return helper(0, 0, inorder.size - 1, preorder, inorder)
//}
//
//fun helper(preStart: Int, inStart: Int, inEnd: Int, preorder: IntArray, inorder: IntArray): TreeNode? {
//    if (inStart > inEnd) {
//        return null
//    }
//    val root = TreeNode(preorder[preStart]) //preOrder's first element is always to root
//    var inRootIdx = 0 // Index of current root in inorder
//    for (i in inStart..inEnd) {
//        if (inorder[i] == root.`val`) {
//            inRootIdx = i
//        }
//    }
//    root.left = helper(preStart + 1, inStart, inRootIdx - 1, preorder, inorder)
//    root.right = helper(preStart + inIndex - inStart + 1, inRootIdx + 1, inEnd, preorder, inorder)
//    return root
//}

