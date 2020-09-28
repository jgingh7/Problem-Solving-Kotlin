package stringEasy

fun main(args: Array<String>) {

    for (i in 1..30) {
        println("$i: ${countAndSay(i)}")
    }
}

//Your runtime beats 10.91 % of kotlin submissions.
//Space Complexity: O(n) - the String size
fun countAndSay(n: Int): String {
    val s = StringBuilder() // use StringBuilder when appending Strings

    if (n == 1) {
        return "1"
    } else {
        val stringBefore = countAndSay(n - 1)
        var numCount = 1 //count of an existing number is at least 1
        for (i in stringBefore.indices) {
            when {
                i == stringBefore.lastIndex -> { //if it is the last index, return the count of the char
                    s.append(numCount).append(stringBefore[i])
                }
                stringBefore[i] == stringBefore[i + 1] -> { //if next char is same as curr char, increment numCount
                    numCount++
                }
                else -> { //else, add the numCount of the char to s, and reset numCount to 1
                    s.append(numCount).append(stringBefore[i])
                    numCount = 1
                }
            }
        }
    }
    return s.toString()
}

//Time Complexity: O(n)
//Space Complexity: O(n^2)? - recursion stack
//fun countAndSay(n: Int): String {
//    var ans = ""
//
//    if (n == 1) {
//        return "1"
//    } else {
//        val stringBefore = countAndSay(n - 1)
//        var numCount = 1
//        for (i in stringBefore.indices) {
//            when {
//                i == stringBefore.lastIndex -> {
//                    ans = "$ans$numCount${stringBefore[i]}"
//                }
//                stringBefore[i] == stringBefore[i + 1] -> {
//                    numCount++
//                }
//                else -> {
//                    ans = "$ans$numCount${stringBefore[i]}"
//                    numCount = 1
//                }
//            }
//        }
//    }
//    return ans
//}



