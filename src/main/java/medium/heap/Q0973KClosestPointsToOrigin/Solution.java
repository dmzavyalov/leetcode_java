package medium.heap.Q0973KClosestPointsToOrigin;

/*

https://leetcode.com/problems/k-closest-points-to-origin/

Array, Math, Divide and Conquer, Geometry, Sorting, Heap (Priority Queue), Quickselect

Time: O(k * log n)

 */

import java.util.PriorityQueue;

public class Solution {
    public int[][] kClosest(int[][] points, int k) {
        //Sorting solution is O (n * log n)
        //Min heap is expected to be more effective than sorting in terms of time, because k < n

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((p1, p2) -> {
            //(x1 - x2)^2 + (y1 - y2)^2
            //I've omitted square root calculation, it doesn't affect comparison result
            //The origin point (x2, y2) is (0,0)
            var d1 = p1[0] * p1[0] + p1[1] * p1[1];
            var d2 = p2[0] * p2[0] + p2[1] * p2[1];
            return Integer.compare(d1, d2);
        });

        for (int[] point : points) {
            minHeap.offer(point);
        }

        var result = new int[k][];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }
        return result;
    }
}
