package arrayEasy

fun main(args: Array<String>) {
    val prices = intArrayOf(7,1,5,3,6,4)
    val ans = maxProfit2(prices)
    println(ans) // 7
}

// Your runtime beats 46.86 % of kotlin submissions. O(n)
// Your memory usage beats 58.67 % of kotlin submissions O(1)
fun maxProfit2(prices: IntArray): Int {
    var res = 0

    for (i in 0 until (prices.size - 1)) {
        if (prices[i + 1] > prices[i]) { // if next is higher, it means that there will be profit
            res += prices[i + 1] - prices[i] // all increases should be added
        }
    }

    return res
}