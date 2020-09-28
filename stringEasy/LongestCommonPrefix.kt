package stringEasy

fun main(args: Array<String>) {
    val strs = arrayOf<String>("flower","flow","flight")
    println(longestCommonPrefix(strs))

}

//Your runtime beats 51.91 % of kotlin submissions. O(n) - n is the sum of all chars in all Strings
//Space Complexity : O(1) - only use constant extra space // substrings are not a guarantee of O(n) space
fun longestCommonPrefix(strs: Array<String>): String {
    when {
        strs.isEmpty() -> {
            return ""
        } else -> {
            var prefix = strs[0] // will return str[0] if all Strings have strs[0] as prefix
            for (i in 1 until strs.size) { // starting from str[1]
                while (strs[i].indexOf(prefix) != 0) { //if the prefix does not fit for str[i]
                    prefix = prefix.substring(0, prefix.length-1) // shorten the prefix
                    if (prefix.isEmpty()) return "" // if prefix has been shortened to where it does not exist, return ""
                }
            }
            return prefix
        }
    }
}

////Your runtime beats 36.94 % of kotlin submissions.
//fun longestCommonPrefix(strs: Array<String>): String {
//    when {
//        strs.isEmpty() -> {
//            return ""
//        }
//        strs.size == 1 -> {
//            return strs[0]
//        }
//        else -> {
//            var prefix = strs[0]
//            for (i in 1 until strs.size) {
//                while (strs[i].indexOf(prefix) != 0) {
//                    prefix = prefix.substring(0, prefix.length-1)
//                    println(prefix)
//                    if (prefix.isEmpty()) return ""
//                }
//            }
//            return prefix
//        }
//    }
//}