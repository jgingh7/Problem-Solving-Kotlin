package dynamicProgrammingEasy

//Your runtime beats 86.02 % of kotlin submissions. O(n)
//Space Complexity: O(1)
fun maxSubArray(nums: IntArray): Int {
    var maxGlobal = nums[0]
    var maxCurrent = nums[0]

    for (i in 1 until nums.size) {
        maxCurrent = maxOf(nums[i], maxCurrent + nums[i]) // max of current sub-array using the ith element
        maxGlobal = maxOf(maxCurrent, maxGlobal) // max between 1. current sub-array using the ith element 2. of all sub-arrays even ones not using ith element
    }

    return maxGlobal
}

////Your runtime beats 86.02 % of kotlin submissions. O(n)
////Space Complexity: O(n) - new array's size
//fun maxSubArray(nums: IntArray): Int {
//    val dp = IntArray(nums.size)
//    var maxCurrent = nums[0]
//
//    dp[0] = maxCurrent
//    for (i in 1 until nums.size) {
//        maxCurrent = maxOf(nums[i], maxCurrent + nums[i]) // max of current sub-array using the ith element
//        dp[i] = maxOf(maxCurrent, dp[i - 1]) // the next max is the max between 1. max of current sub-array using the ith element 2. max of i - 1 array
//    }
//    return dp[nums.size - 1]
//}