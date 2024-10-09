package medium.graph.Q0743NetworkDelayTime;

/*
https://leetcode.com/problems/network-delay-time/
Dijkstra's algorithm
Time: E log V
Space: O(V^2)
 */

import java.util.*;

public class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> edges = new HashMap<>();

        //from, to, time
        for (int[] e : times) {
            edges
                .computeIfAbsent(e[0], v -> new ArrayList<>())  //from
                .add(new int[]{e[1], e[2]});    //to, time
        }

        //path cost, node number
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        minHeap.offer(new int[]{0, k});   //Starting node

        Set<Integer> visited = new HashSet<>();
        int t = 0;

        while (!minHeap.isEmpty()) {
            int[] entry = minHeap.poll();
            int w1 = entry[0], n1 = entry[1];
            if (visited.contains(n1)) {
                continue;
            }
            visited.add(n1);
            t = Math.max(t, w1);

            if (edges.containsKey(n1)) { //It's possible that the node has no outgoing edges
                //Loop through all the node neighbors
                for (int[] e : edges.get(n1)) {
                    int n2 = e[0], w2 = e[1];
                    if (!visited.contains(n2)) {
                        minHeap.offer(new int[]{w2 + w1, n2});
                    }
                }
            }
        }

        return visited.size() == n ? t : -1;
    }
}
