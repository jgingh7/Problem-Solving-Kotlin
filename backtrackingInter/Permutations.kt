//Your runtime beats 58.82 % of kotlin submissions. O(n^2) //choice to add or not
//Space complexity: O(n) - recursion stack

val res = mutableListOf<List<Int>>()

fun permute(nums: IntArray): List<List<Int>> {
    backtrack(listOf(), nums.toList())
    return res
}

fun backtrack(added: List<Int>, left: List<Int>) {
    if (left.isEmpty()) {
        res.add(added)
    } else {
        left.forEach { candidate ->
            backtrack(added + candidate, left - candidate)
        }
    }
}