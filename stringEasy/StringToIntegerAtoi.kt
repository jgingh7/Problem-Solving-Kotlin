package stringEasy

fun main(args: Array<String>) {

    val str = "9223372036854775808"
    println(myAtoi(str))

}

//Your runtime beats 63.13 % of kotlin submissions. O(n)
//Space Complexity: O(1)
fun myAtoi(str: String): Int {
    var res: Long = 0
    var isNegative = false
    var start = 0

    for (i in str.indices) { // find the starting index (skipping whitespaces)
        if (str[i] != ' ') {
            start = i
            break
        }
    }

    for (i in start until str.length) {
        if (str[i].isDigit()) {
            res = res * 10 + str[i].toString().toLong() // make the string into Long
            if (res > Int.MAX_VALUE) break // if reached max, break
        } else if ((str[i] == '-' || str[i] == '+') && (i != str.lastIndex && str[i + 1].isDigit())) { //if +/- and it is not the lastIndex and next char is a digit
            if (i != 0 && str[i - 1].isDigit()) { // but if it is not the starting char and the char before is a digit, not the right +/-
                break
            } else if (str[i] == '-') { // if -, is negative, if + do nothing
                isNegative = true
            }
        } else { // if not a digit or appropriate +/-, break
            break
        }
    }

    if (isNegative) {
        res *= -1
    }

    if (res > Int.MAX_VALUE) {
        return Int.MAX_VALUE
    } else if (res < Int.MIN_VALUE) {
        return Int.MIN_VALUE
    }

    return res.toInt()
}