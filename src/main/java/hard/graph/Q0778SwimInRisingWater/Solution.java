package hard.graph.Q0778SwimInRisingWater;

/*
https://leetcode.com/problems/swim-in-rising-water/
Time:O(n^2 log n)
 */

import java.util.PriorityQueue;

public class Solution {

    public int swimInWater(int[][] grid) {
        final int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        int len = grid.length;
        if (len == 0)  {
            return 0;
        }

        var visited = new boolean[len][len];
        visited[0][0] = true;

        var minHeap = new PriorityQueue<int[]>((a, b) -> a[0] - b[0]);
        //max height on the path, x, y
        minHeap.add(new int[]{grid[0][0], 0, 0});

        int result = 0;

        while (!minHeap.isEmpty()) {
            var curr = minHeap.poll();
            //This is modified Dijkstra's algorithm
            //We track max height on the path instead of path length
            result = Math.max(result, curr[0]);
            if (curr[1] == len - 1 && curr[2] == len - 1) {
                break;  //We've reached the bottom right corner
            }
            for (int i = 0; i < 4; i++) {   //Attempt to move in all four directions
                int x = curr[1] + dirs[i][0];
                int y = curr[2] + dirs[i][1];
                if (x < 0 || y < 0 || x >= len || y >= len || visited[x][y]) {
                    continue;   //Out of borders, or visited
                }
                minHeap.add(new int[]{grid[x][y], x, y});
                visited[x][y] = true;
            }
        }

        return result;
    }
}
