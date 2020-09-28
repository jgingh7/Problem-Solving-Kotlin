package dynamicProgrammingEasy

fun main(args: Array<String>) {
    val test = intArrayOf(1)
    println(rob(test))
}

//Your runtime beats 86.29 % of kotlin submissions. O(n)
//Space Complexity: O(n)
fun rob(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    if (nums.size == 1) return nums[0]

    val dp = IntArray(nums.size)
    dp[0] = nums[0]
    dp[1] = maxOf(nums[0], nums[1]) // for first two elements, the larger one is the answer

    for (i in 2 until nums.size) {
        dp[i] = maxOf(dp[i - 2] + nums[i], dp[i - 1]) // the answer for ith element is the max between 1. adding ith element to the answer for i-2th array, or 2. answer for i-1th array
    }
    return dp[nums.size - 1]
}