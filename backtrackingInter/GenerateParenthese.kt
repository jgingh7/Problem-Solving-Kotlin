//Your runtime beats 84.43 % of kotlin submissions. 미침

fun generateParenthesis(n: Int): List<String?> {
    val ans = ArrayList<String>()
    backtrack(ans, "", 0, 0, n)
    return ans
}

fun backtrack(ans: ArrayList<String>, curr: String, open: Int, close: Int, max: Int) {
    if (curr.length == max * 2) {
        ans.add(curr)
        return
    }
    if (open < max) backtrack(ans, "$curr(", open + 1, close, max) // start an opening bracket if we still have one (of n) left to place
    if (close < open) backtrack(ans, "$curr)", open, close + 1, max) // start a closing bracket if it would not exceed the number of opening brackets
}