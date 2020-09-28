package arrayEasy

//Your runtime beats 99.64 % of kotlin submissions. O(n)
//Your memory usage beats 69.56 % of kotlin submissions. O(1)
fun maxProfit1(prices: IntArray): Int {
    if (prices.isEmpty()) {
        return 0
    }
    var min = prices[0] // min is the starting number (empty array has been dealt with already)
    var currRes: Int?
    var res = 0
    for (i in 1 until prices.size) {
        if (prices[i] < min) { // keep minimum number
            min = prices[i]
        } else { //prices[i] >= min
            currRes = prices[i] - min // the current node and min's difference
            if (currRes > res) {
                res = currRes
            }
        }
    }
    return res
}