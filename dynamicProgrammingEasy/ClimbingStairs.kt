package dynamicProgrammingEasy

//Dynamic Programming refers to simplifying a complicated problem by breaking it down into simpler sub-problems in a recursive manner.
//Your runtime beats 65.20 % of kotlin submissions. O(n)
//Your memory usage beats 38.60 % of kotlin submissions. O(n) - new array's size
fun climbStairs(n: Int): Int {
    val dp = IntArray(n + 1)
    for (i in dp.indices) {
        if (i <= 3) {
            dp[i] = i
        } else {
            dp[i] = dp[i - 1] + dp[i - 2] // in order to reach the ith step, you either take 1 step up from i-1th step or 2 steps up from i-2th step
        }
    }
    return dp[n]
}

// can solve this problem just fibonacci numbers (O(n), O(1)), but used dynamic programming