package arrayEasy

fun main(args: Array<String>) {
    val matrix = arrayOf(
        intArrayOf( 5, 1, 9,11),
        intArrayOf( 2, 4, 8,10),
        intArrayOf(13, 3, 6, 7),
        intArrayOf(15,14,12,16)
    )
    rotate(matrix)
//    [
//        [5, 2,13,15],
//        [1, 4, 3,14],
//        [9, 8, 6,12],
//        [11,10,7,16]
//    ]
//    [
//      [15,13, 2, 5],
//      [14, 3, 4, 1],
//      [12, 6, 8, 9],
//      [16, 7,10,11]
//    ]
}

//1. transpose (row to col, col to row)
//2. shift the columns with middle as the pivot

//Your runtime beats 11.93 % of kotlin submissions. O(n^2)
//Your memory usage beats 7.84 % of kotlin submissions. O(1)
fun rotate(matrix: Array<IntArray>): Unit {
    val n = matrix.size
    for (i in 0 until n) {
        for (j in i until n) {
            val temp = matrix[i][j]
            matrix[i][j] = matrix[j][i]
            matrix[j][i] = temp
        }
    }

    for (i in 0 until n) {
        for (j in 0 until (n / 2)) {
            val temp = matrix[i][j]
            matrix[i][j] = matrix[i][n - 1 - j]
            matrix[i][n - 1 - j] = temp
        }
    }
}