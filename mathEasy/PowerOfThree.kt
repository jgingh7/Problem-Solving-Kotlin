package mathEasy

//Your runtime beats 76.74 % of kotlin submissions. O(log3(n)) - because of the division of 3
//Space Complexity O(1)
fun isPowerOfThree(n: Int): Boolean {
    var currN = n
    if (n == 0) return false
    while (currN != 1) { // when reached 1, no need to check
        if(currN % 3 != 0) return false // keep dividing with , and if remainders occur, return false
        currN /= 3
    }
    return true
}

////Not using recursions or iterations
////Your runtime beats 48.84 % of kotlin submissions. Unknown Time Complexity, dependent on the language and compiler. (Math.log10 will be the upper bound because it will be the most expensive)
////Space Complexity O(1)
//fun isPowerOfThree(n: Int): Boolean {
//    if (n == 0) return false
//    val num = Math.log10(n.toDouble()) / Math.log10(3.0) // 3^num = n // num = log3(n) // num = log(n)/log(3)
//    if (num - num.toInt() != 0.0) return false // If not a whole number, return false
//    return true
//}