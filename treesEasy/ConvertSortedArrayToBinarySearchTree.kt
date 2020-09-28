package treesEasy

// for balanced tree, a recursion should work
//Your runtime beats 39.22 % of kotlin submissions. O(n)
//Space Complexity: O(n) - recursion stack
fun sortedArrayToBST(nums: IntArray): TreeNode? {
    val arraySize = nums.size
    if (nums.isEmpty()) return null

    val middle = arraySize / 2
    val root = TreeNode(nums[middle]) // root is the middle of the array (since the array is sorted)
    root.left = sortedArrayToBST(nums.sliceArray(0 until middle)) // root.left is recursion of intArray which is sliced from 0 to just before middle
                                                                         // if nums.size == 1, the sliced array is an empty array, which would in turn make root.left to be null
    root.right = sortedArrayToBST(nums.sliceArray(middle + 1 until nums.size))
    return root
}