package stringEasy

fun main(args: Array<String>) {
    val haystack = "hello"
    val needle = "ll"
    println(strStr(haystack, needle))
}

//Your runtime beats 31.12 % of kotlin submissions. O(n)
//Space Complexity O(1)
fun strStr(haystack: String, needle: String): Int {
    return when {
        needle.isEmpty() -> 0
        haystack.contains(needle) -> haystack.indexOf(needle)
        else -> -1
    }
}
//do this first, and then if more explanation needed, use below

//////Your runtime beats 25.31 % of kotlin submissions. O(nm)
//////Your memory usage beats 47.37 % of kotlin submissions. O(n)
//fun strStr(haystack: String, needle: String): Int {
//    if (needle.isEmpty()) return 0
//    val maxIndex = haystack.length - needle.length
//    for (i in 0 .. maxIndex) {
//        if (haystack[i] == needle[0]) { // when first letter of needle is equal
//            for (j in needle.indices) {
//                if (needle[j] != haystack[i + j]) break // if not equal, break the inner loop
//                if (j == needle.length - 1) return i // when reached the end, return index of hayStack
//            }
//        }
//    }
//    return -1
//}


//Your runtime beats 24.37 % of kotlin submissions. O(n)
//Your memory usage beats 37.28 % of kotlin submissions. O(n*m)?
//fun strStr(haystack: String, needle: String): Int {
//    val needleLength = needle.length
//    if (needleLength == 0) {
//        return 0
//    }
//    for (i in 0..(haystack.length - needleLength)) { //if needleLength is longer, compiler does not enter the for loop
//        if (haystack.substring(i, i + needleLength) == needle) {
//            return i
//        }
//    }
//    return -1
//}