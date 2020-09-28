//Your runtime beats 100.00 % of kotlin submissions. O(m + n)

fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    if (matrix.isEmpty() || matrix[0].isEmpty()) return false

    //start from the top row and scan
    var col = matrix[0].size - 1
    var row = 0
    while (col >= 0 && row <= matrix.size - 1) {
        when {
            target == matrix[row][col] -> return true
            target < matrix[row][col] -> col--
            target > matrix[row][col] -> row++
        }
    }
    return false
}