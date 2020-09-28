package stringEasy

fun main(args: Array<String>) {
    println(reverse(1534236469))
}


//Your runtime beats 36.05 % of kotlin submissions. O(n)
// - We use a bunch of methods with linear complexity, but they are chained as opposed to nested, so the runtime will be dependent on the number of digits in the input. We can say O(len X)
//Your memory usage beats 14.92 % of kotlin submissions. O(1)
fun reverse(x: Int): Int {
    val newString = if (x < 0) { // reverse the int by converting to String
        "-${(x * -1).toString().reversed()}"
    } else {
        x.toString().reversed()
    }

    return try {
        newString.toInt() // return the newString
    } catch (e: NumberFormatException) { // if become Long, return 0
        0
    }
}

//If not String should be used
//
//Your runtime beats 7.26 % of kotlin submissions. O(n)
//Your memory usage beats 34.82 % of kotlin submissions. O(1)
//fun reverse(x: Int): Int {
//    var currNum = x
//    var currDigit: Int
//    var reversed: Long = 0
//    var isNegative = false
//
//    if (x < 0) {
//        currNum *= -1
//        isNegative = true
//    }
//
//    while(currNum > 0) { // making reversed int
//        currDigit = currNum % 10
//        reversed = reversed * 10 + currDigit
//        currNum /= 10
//    }
//
//    if (reversed > Int.MAX_VALUE) {
//        return 0
//    }
//    if (isNegative) {
//        reversed *= -1
//    }
//
//    return reversed.toInt()
//}