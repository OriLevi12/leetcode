class Solution {
    /**
 * LeetCode 200 - Number of Islands
 * Approach: DFS (recursive)
 * Time complexity: O(rows * cols)
 * Space complexity: O(rows * cols) in worst case (call stack)
 */
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0)
            return 0;

        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for(int i = 0; i < rows; i++){
            
            for(int j = 0; j < cols; j++){

                if(grid[i][j] == '1'){
                    dfs(grid, i , j);
                    count++;
                }

            }
        }
        return count;
    }

    private void dfs(char[][]grid,int row,int col){
        
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == '0' ){
            return;
        }

        grid[row][col] = '0';

        dfs(grid, row + 1 , col); //down
        dfs(grid, row - 1, col); // up
        dfs(grid, row, col + 1); //right
        dfs(grid, row, col - 1); //left
    }
}
