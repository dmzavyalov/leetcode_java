package medium.graph.Q0695MaxAreaOfIsland;

/*

https://leetcode.com/problems/max-area-of-island/

Array, Depth-First Search, Breadth-First Search, Union Find, Matrix

Time: O(m * n)

 */

public class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                maxArea = Math.max(maxArea, dfs(grid, r, c));
            }
        }

        return maxArea;
    }

    //Return area of the island with the specified starting point
    private int dfs(int[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0) {
            return 0;   // Base case
        }

        grid[r][c] = 0; //Mark as visited

        //Area includes the cell itself plus whatever area we calculate by extending in every possible direction
        return 1 +
            dfs(grid, r + 1, c) +
            dfs(grid, r - 1, c) +
            dfs(grid, r, c + 1) +
            dfs(grid, r, c - 1)
        ;
    }
}
