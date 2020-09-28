package stringEasy

//Your runtime beats 32.17 % of kotlin submissions. O(n) to swap n/2 elements
//Space Complexity: O(n)
fun reverseString(s: CharArray): Unit {
    val arraySize = s.size
    for (i in 0 until (arraySize / 2)) {
        val temp = s[i]
        s[i] = s[arraySize - i - 1]
        s[arraySize - i - 1] = temp
    }
}