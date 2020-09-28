package othersEasy

//Your runtime beats 97.73 % of kotlin submissions. O(n^2)
//Space Complexity: O(n^2)
fun generate(numRows: Int): List<List<Int>> {
    val res = ArrayList<List<Int>>()
    for (i in 0 until numRows) { // if numRows == 5, 0 ~ 4
        val innerList = ArrayList<Int>()
        for (j in 0..i) {
            when (j) {
                0 -> innerList.add(1) // at start, add 1
                i -> innerList.add(1) // at the end, add 1
                else -> innerList.add(res[i - 1][j - 1] + res[i - 1][j]) // add the numbers from the previous list
            }
        }
        res.add(innerList)
    }
    return res
}