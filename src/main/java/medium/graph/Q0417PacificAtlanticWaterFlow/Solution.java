package medium.graph.Q0417PacificAtlanticWaterFlow;

import java.util.ArrayList;
import java.util.List;

/*

https://leetcode.com/problems/pacific-atlantic-water-flow/

Array, Depth-First Search, Breadth-First Search, Matrix

Time: O(n * m)

 */

public class Solution {
    final int[][] directions = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        //The main idea is to start the search from the oceans
        List<List<Integer>> result = new ArrayList<>();

        int ROWS = heights.length, COLS = heights[0].length;

        //Track which points are reachable from each of the oceans
        boolean[][] pacific = new boolean[ROWS][COLS];
        boolean[][] atlantic = new boolean[ROWS][COLS];

        //Start search from all the points in top and bottom rows (ocean shore)
        for (int i = 0; i < COLS; i++) {
            dfs(heights, 0, i, Integer.MIN_VALUE, pacific);
            dfs(heights, ROWS - 1, i, Integer.MIN_VALUE, atlantic);
        }

        //Start search from all the points in left and right columns (ocean shore)
        for (int i = 0; i < ROWS; i++) {
            dfs(heights, i, 0, Integer.MIN_VALUE, pacific);
            dfs(heights, i, COLS - 1, Integer.MIN_VALUE, atlantic);
        }

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(List.of(i, j));
                }
            }
        }

        return result;
    }

    private void dfs(int[][] heights, int i, int j, int prevHeight, boolean[][] visited) {
        if (i < 0 || i >= visited.length ||
            j < 0 || j >= visited[0].length ||
            heights[i][j] < prevHeight || visited[i][j]
        ) {
            return;
        }

        visited[i][j] = true;
        for (int[] d : directions) {
            dfs(heights, i + d[0], j + d[1], heights[i][j], visited);
        }
    }
}
