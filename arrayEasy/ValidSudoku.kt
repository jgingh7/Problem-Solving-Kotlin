package arrayEasy

fun main(args: Array<String>) {
    val board =arrayOf(
            charArrayOf('5','3','.','.','7','.','.','.','.'),
            charArrayOf('6','.','.','1','9','5','.','.','.'),
            charArrayOf('.','9','8','.','.','.','.','6','.'),
            charArrayOf('8','.','.','.','6','.','.','.','3'),
            charArrayOf('4','.','.','8','.','3','.','.','1'),
            charArrayOf('7','.','.','.','2','.','.','.','6'),
            charArrayOf('.','6','.','.','.','.','2','8','.'),
            charArrayOf('.','.','.','4','1','9','.','.','5'),
            charArrayOf('.','.','.','.','8','.','.','7','9'))
    val res = isValidSudoku(board)
    println(res) // true
}

//Your runtime beats 77.55 % of kotlin submissions.
// - Time complexity does not matter here since it is given that it is 9*9
//Space Complexity: O(n)
fun isValidSudoku(board: Array<CharArray>): Boolean {
    val set = HashSet<String>()
    for (i in 0 until 9) {
        for (j in 0 until 9) {
            val theValue = board[i][j]
            if (theValue.compareTo('.') != 0) {
                // Return true if the element has been added, false if the element is already contained in the set.
                if (!set.add("$theValue is found in row $i") || // add in what row the value has been found
                        !set.add("$theValue is found in col $j") || // add in what column the value has been found
                        !set.add("$theValue is found in sub box ${i/3} - ${j/3}")) { // add in what sub box the value has been found
                    return false
                }
            }
        }
    }
    return true
}