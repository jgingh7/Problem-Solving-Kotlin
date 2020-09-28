package arrayInter


//Your runtime beats 68.93 % of kotlin submissions. O(n^2)
//Space Complexity: O(1)
fun longestPalindrome(s: String): String {
    if (s.isEmpty()) return ""

    var start = 0
    var end = 0

    for (i in s.indices) {
        val len1 = expandFromMiddle(s, i, i) //case for odd numbered palindrome "aba"
        val len2 = expandFromMiddle(s, i, i + 1) //case for even numbered palindrome "abba"
        val len = maxOf(len1, len2)
        if (len > end - start) { // if a longer palindrome is found
            start = i - ((len - 1) / 2) // if "abba", len == 4, i == 1, start == 0 // if "abcba", len == 5, i == 2, start == 0
            end = i + (len / 2)
        }
    }
    return s.substring(start, end + 1) // "end + 1" because substring() cuts until just before the ending index
}

fun expandFromMiddle(s: String, left: Int, right: Int): Int {
    var lft = left
    var rgt = right

    while (lft >= 0 && rgt < s.length && s[lft] == s[rgt]) { // if the ptrs are in the boundary and their values are same, keep looping // if they are still palindrome, keep looping
        lft--
        rgt++
    }
    return rgt - lft - 1 // "- 1" because lft and rgt are already on ptrs that are larger than the palindrome
                         // if "kabad", 4 - 0 - 1 = 3
}