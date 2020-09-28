//Quicksort
//Your runtime beats 92.00 % of kotlin submissions.
//O(1)
fun sortColors(nums: IntArray) {
    // 1-pass
    var low = 0
    var high = nums.size - 1
    var index = 0
    while (index <= high) {
        if (nums[index] == 0) {
            nums[index] = nums[low]
            nums[low] = 0
            low++
        }
        if (nums[index] == 2) {
            nums[index] = nums[high]
            nums[high] = 2
            high--
            index--
        }
        index++
    }
}

////CountingSort
////Your runtime beats 28.00 % of kotlin submissions.
//fun sortColors(nums: IntArray): Unit {
//    // 2-pass
//    var count0 = 0
//    var count1 = 0
//    var count2 = 0
//    for (i in nums.indices) {
//        if (nums[i] == 0) {
//            count0++
//        }
//        if (nums[i] == 1) {
//            count1++
//        }
//        if (nums[i] == 2) {
//            count2++
//        }
//    }
//    for (i in nums.indices) {
//        when {
//            i < count0 -> {
//                nums[i] = 0
//            }
//            i < count0 + count1 -> {
//                nums[i] = 1
//            }
//            else -> {
//                nums[i] = 2
//            }
//        }
//    }
//}