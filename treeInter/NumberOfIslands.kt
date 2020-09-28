//Your runtime beats 95.77 % of kotlin submissions. O(M×N) or O(cells) where M is the number of rows and N is the number of columns.
//Space complexity : worst case O(M×N) in case that the grid map is filled with lands where DFS goes by M×N deep.

class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        var count = 0
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if (grid[i][j] == '1') {
                    count += dfs(grid, i, j)
                }
            }
        }
        return count
    }

    fun dfs(grid: Array<CharArray>, i: Int, j: Int): Int{
        if (i < 0 || j < 0 || i >= grid.size || j >= grid[0].size || grid[i][j] == '0')
            return 0
        grid[i][j] = '0' // make sure we don't visit again
        dfs(grid, i - 1, j)
        dfs(grid, i + 1, j)
        dfs(grid, i, j - 1)
        dfs(grid, i, j + 1)
        return 1
    }
}