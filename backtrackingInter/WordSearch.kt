//Your runtime beats 97.11 % of kotlin submissions. (4^nm) - visiting all the 4 sides of all cells
//Space Complexity: O(nm)
fun exist(board: Array<CharArray>, word: String): Boolean {
    if (word.isEmpty()) return false

    for (i in board.indices) {
        for (j in board[i].indices) {
            if (word[0] == board[i][j]) {
                if (dfs(i, j, board, word, 0)) {
                    return true
                }
            }
        }
    }
    return false
}

fun dfs(i: Int, j: Int, board: Array<CharArray>, word: String, wordIdx: Int): Boolean {
    if (wordIdx >= word.length) return true //if all letters for the word are explored, return true
    if (i < 0 || i >= board.size || j < 0 || j >= board[i].size || word[wordIdx] != board[i][j])
        return false

    val temp = board[i][j]
    board[i][j] = '0' //makes zero to not visit the element again

    // if one of them returns true, then there is a path
    if (dfs(i + 1, j, board, word, wordIdx + 1) ||
            dfs(i - 1, j, board, word, wordIdx + 1) ||
            dfs(i, j + 1, board, word, wordIdx + 1) ||
            dfs(i, j - 1, board, word, wordIdx + 1)) return true

    board[i][j] = temp //fix back the zero so that the upper stack can have the original element to compare

    return false
}
