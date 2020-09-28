package arrayEasy

fun main(args: Array<String>) {
    val nums = intArrayOf(0,1,0,3,12)
    moveZeroes(nums)
    printArray(nums) //1,3,12,0,0
}

// Your runtime beats 96.92 % of kotlin submissions. O(n)
// Space Complexity: O(1)
fun moveZeroes(nums: IntArray): Unit {
    var newIndex = 0
    for (i in nums.indices) {
        if (nums[i] != 0) { // if not 0, piled up to the front of the array
            nums[newIndex++] = nums[i]
        }
    }
    for (i in newIndex until nums.size) { // starting from right after the non-0s, place 0s
        nums[i] = 0
    }
}

////Your runtime beats 72.94 % of kotlin submissions. O(n)
////Your memory usage beats 17.26 % of kotlin submissions. O(1)
//fun moveZeroes(nums: IntArray): Unit {
//    var newIndex = 0
//    var zeroCounter = 0
//    for (i in nums.indices) {
//        if (nums[i] != 0) {
//            nums[newIndex] = nums[i]
//            newIndex++
//        } else {
//            zeroCounter++
//        }
//    }
//    if (zeroCounter == 0) {
//
//    } else {
//        for (i in nums.lastIndex downTo (nums.size - zeroCounter)) {
//            nums[i] = 0
//        }
//    }
//}

