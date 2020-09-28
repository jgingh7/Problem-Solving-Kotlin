package arrayEasy

fun main(args: Array<String>) {
    val nums = intArrayOf(0,0,1,1,1,2,2,3,3,4)
    val ans = removeDuplicates(nums)
    println(ans) // 5
}

//Your runtime beats 81.04 % of kotlin submissions. O(n)
//Your memory usage beats 23.54 % of kotlin submissions. O(1)
fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0 // return 0 if nums is empty

    var arraySize = 1 // if nums is not empty, it should be greater than or equal to 1

    for (i in 1 until nums.size) {
        if (nums[i] != nums[i - 1]) { // if number before does not equal to number now, the number now is being placed in front
            nums[arraySize] = nums[i]
            arraySize++
        }
    }

    return arraySize
}
