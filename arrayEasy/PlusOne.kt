package arrayEasy

fun main(args: Array<String>) {
    val digits = intArrayOf(4,3,2,1)
    val ans = plusOne(digits)
    printArray(ans) // 4,3,2,2
}

//Your runtime beats 63.37 % of kotlin submissions. O(n)
//Space Complexity: O(n) - arrayList
fun plusOne(digits: IntArray): IntArray {
    for (i in digits.lastIndex downTo 0) {
        if (i == digits.lastIndex) {
            digits[i]++
        }

        if (digits[i] == 10) {
            if (i == 0) {
                val ans = IntArray(digits.size + 1) //IntArray with 0s
                ans[0] = 1
                return ans
            } else {
                digits[i] = 0
                digits[i - 1]++
            }
        }
    }
    return digits
}