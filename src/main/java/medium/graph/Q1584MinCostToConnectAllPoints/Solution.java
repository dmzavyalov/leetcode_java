package medium.graph.Q1584MinCostToConnectAllPoints;

/*
https://leetcode.com/problems/min-cost-to-connect-all-points/
Time: O(n^2 log n)
Space: O(n^2)
 */

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Solution {
    public int minCostConnectPoints(int[][] points) {
        //Edge weight, the index of the next node
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b [0]);
        pq.offer(new int[]{0, 0});
        int len = points.length;
        Set<Integer> visited = new HashSet<>();
        int cost = 0;
        while (visited.size() < len) {  //While some nodes remain unconnected
            int[] arr = pq.poll();

            int weight = arr[0];
            int curNode = arr[1];

            if (visited.contains(curNode)) {
                continue;
            }

            visited.add(curNode);
            cost += weight;

            for (int nextNode = 0; nextNode < len; nextNode++) {
                if (!visited.contains(nextNode)) {
                    //Manhattan distance
                    int nextWeight =
                        Math.abs(points[nextNode][0] - points[curNode][0]) +
                        Math.abs(points[nextNode][1] - points[curNode][1]);
                    pq.offer(new int[] {nextWeight, nextNode});
                }
            }

        }
        return cost;
    }
}
