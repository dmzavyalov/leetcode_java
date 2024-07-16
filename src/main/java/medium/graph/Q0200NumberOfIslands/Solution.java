package medium.graph.Q0200NumberOfIslands;

/*

https://leetcode.com/problems/number-of-islands/description/

Array, Depth-First Search, Breadth-First Search, Union Find, Matrix

 */

public class Solution {
    public int numIslands(char[][] grid) {
        int numIslands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);    //BFS can also be used here
                    numIslands++;
                }
            }
        }

        return numIslands;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return; //Out of the grid or in the water
        }
        grid[i][j] = '0';   //Visited marker
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}
