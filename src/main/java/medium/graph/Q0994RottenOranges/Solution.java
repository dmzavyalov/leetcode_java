package medium.graph.Q0994RottenOranges;

/*

https://leetcode.com/problems/rotting-oranges/

Array, Breadth-First Search, Matrix

Time: O(n*m)

 */

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int orangesRotting(int[][] grid) {
        //Multi-source BFS
        int n = grid.length;
        int m = grid[0].length;

        int time = 0, fresh = 0;

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    //We put rotten oranges in the queue to start the BFS from their positions
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    //And we count how many fresh oranges do we have to know later if all of them has become rotten or not
                    fresh++;
                }
            }
        }

        int[] directions = {-1, 0, 1, 0, -1};

        while (!queue.isEmpty() && fresh > 0) {
            time++;
            //Backward iteration so that queue size evaluated only once at the start. This determines next layer size
            for (int i = queue.size(); i > 0; i--) {
                int[] p = queue.poll();
                for (int j = 0; j < 4; j++) {   //Attempt to move in all four directions
                    int x = p[0] + directions[j];
                    int y = p[1] + directions[j + 1];
                    if (x >= 0 && x < n && y >= 0 && y < m && grid[x][y] == 1) {
                        //Make fresh orange rotten
                        grid[x][y] = 2;
                        queue.offer(new int[]{x, y});
                        fresh--;
                    }
                }
            }
        }

        return fresh == 0 ? time : -1;
    }
}
