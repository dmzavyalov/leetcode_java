package medium.graph.Q0286WallsAndGates;

/*

https://leetcode.com/problems/walls-and-gates

Time: O(m*n)

 */

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public void wallsAndGates(int[][] rooms) {
        //Multi-source BFS
        int n = rooms.length;
        int m = rooms[0].length;

        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //Start the search from all the gates simultaneously
                if (rooms[i][j] == 0) {
                    q.offer(new int[]{i, j});
                }
            }
        }

        int distance = 0;
        int[] directions = {-1, 0, 1, 0, -1};
        //Repeat as long as we have rooms to explore
        while (!q.isEmpty()) {  //If there is next layer
            //For each next adjacent layer of rooms the distance to the gate increases by one
            ++distance;
            //Backward iteration so that queue size evaluated only once at the start. This determines next layer size
            for (int i = q.size(); i > 0; --i) { //Explore rooms on this layer
                int[] p = q.poll();
                for (int j = 0; j < 4; ++j) { //Attempt to move in all four directions
                    int x = p[0] + directions[j];
                    int y = p[1] + directions[j + 1];
                    //Do not change score of rooms already explored
                    if (x >= 0 && x < n && y >= 0 && y < m && rooms[x][y] == Integer.MAX_VALUE) {
                        rooms[x][y] = distance;
                        q.offer(new int[] {x, y});  //Add room to the queue to explore its neighbors in the next layer
                    }
                }
            }
        }
    }
}
