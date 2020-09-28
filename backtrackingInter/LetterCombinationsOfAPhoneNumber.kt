//Your runtime beats 80.74 % of kotlin submissions.
//Time complexity : O(3^N * 4^M) where N is the number of digits in the input that maps to 3 letters (e.g. 2, 3, 4, 5, 6, 8)
// and M is the number of digits in the input that maps to 4 letters (e.g. 7, 9), and N+M is the total number digits in the input.
//
//Space complexity : O(3^N * 4^M) since one has to keep 3^N * 4^M solutions.
val phone = hashMapOf(
        '2' to "abc",
        '3' to "def",
        '4' to "ghi",
        '5' to "jkl",
        '6' to "mno",
        '7' to "pqrs",
        '8' to "tuv",
        '9' to "wxyz"
)

fun letterCombinations(digits: String): List<String> {
    val ans = mutableListOf<String>()
    if (digits.isNotEmpty()) backtrack("", digits, ans)
    return ans
}

fun backtrack (combi: String, nextString: String, ans: MutableList<String>) {
    if (nextString.isEmpty()) ans.add(combi)
    else {
        val digit = nextString[0]
        val letters = phone[digit]!!
        for (letter in letters) { //go through the letters by for loop
            backtrack(combi + letter, nextString.substring(1), ans) //go through the numbers by substringing
        }
    }
}
