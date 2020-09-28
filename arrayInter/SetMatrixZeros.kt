package arrayInter

// Your runtime beats 50.00 % of kotlin submissions. O(mn)
// Space Complexity: O(1)
class Solution {
    fun setZeroes(matrix: Array<IntArray>): Unit {
        var isZeroForCol = false
        var isZeroForRow = false

        if (matrix[0].contains(0)) isZeroForRow = true // if first row contains 0, it will become all 0

        for (i in matrix.indices) {
            if (matrix[i][0] == 0) isZeroForCol = true // if first col contains 0, it will become all 0
            for (j in matrix[i].indices) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0 // place 0 on all first element of cols with a 0 as an element
                    matrix[i][0] = 0 // place 0 on all first element of rows with a 0 as an element
                }
            }
        }

        for (i in 1 until matrix.size) {
            for (j in 1 until matrix[0].size) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) { // if either row or col's first element is 0, place 0 (not including the first row or col)
                    matrix[i][j] = 0
                }
            }
        }

        // check for the first row and make all 0 if isZeroForRow
        if (isZeroForRow) {
            for (j in matrix[0].indices) {
                matrix[0][j] = 0
            }
        }

        // check for the first col and make all 0 if isZeroForCol
        if (isZeroForCol) {
            for (lst in matrix) {
                lst[0] = 0
            }
        }

    }
}