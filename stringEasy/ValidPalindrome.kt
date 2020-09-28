package stringEasy

fun main(args: Array<String>) {
    val s = "`l;`` 1o1 ??;l`"
    println(isPalindrome(s)) // true
}

//Your runtime beats 100.00 % of kotlin submissions. O(n)
//Space Complexity: O(1)
fun isPalindrome(s: String): Boolean {
    var left = 0
    var right = s.length - 1
    while (left < right) { // loop until all are checked
        when {
            !s[left].isLetterOrDigit() -> left++ //keep moving right if not alphanumerical
            !s[right].isLetterOrDigit() -> right-- //keep moving left if not alphanumerical
            else -> {
                if (s[left].toLowerCase() != s[right].toLowerCase()) return false // if not equal, return false
                left++
                right--
            }
        }
    }
    return true
}


////Your runtime beats 18.59 % of kotlin submissions. O(n) - filter + while
////Space Complexity: O(n) - filter
//fun isPalindrome(s: String): Boolean {
//    val newString = s.filter { char -> // make a filtered String
//        char.isLetterOrDigit()
//    }
//
//    var left = 0
//    var right = newString.length - 1
//    while (left < right) {
//        if (newString[left].toLowerCase() != newString[right].toLowerCase()) return false
//        left++
//        right--
//    }
//
//    return true
//}
