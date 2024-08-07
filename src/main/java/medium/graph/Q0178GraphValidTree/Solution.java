package medium.graph.Q0178GraphValidTree;

/*

https://www.lintcode.com/problem/178/

Time: O(E+V)
Space: O(E+V)

 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    private Map<Integer, Set<Integer>> adjacencyList = new HashMap<>();

    public boolean validTree(int n, int[][] edges) {
        //A tree is a graph that has no loops and is connected

        if (n == 0 || n == 1) {
            return true;
        }

        if (null == edges || edges.length == 0) {
            return false;
        }

        for (var edge: edges) {
            //The graph is not directed
            adjacencyList.putIfAbsent(edge[0], new HashSet<>());
            adjacencyList.putIfAbsent(edge[1], new HashSet<>());
            adjacencyList.get(edge[0]).add(edge[1]);
            adjacencyList.get(edge[1]).add(edge[0]);
        }

        Set<Integer> visited = new HashSet<>();

        //We pass down the previous node so that the search does not move backwards
        //The DFS checks that there are no loops and marks reachable notes
        //Then we check that we've reached all the nodes, that is the graph is connected
        return dfs(edges[0][0], -1, visited) && visited.size() == n;
    }

    private boolean dfs(int node, int previous, Set<Integer> visited) {
        if (visited.contains(node)) {
            return false;   //Loop detected
        }

        visited.add(node);

        for (var neighbor: adjacencyList.get(node)) {
            if (neighbor != previous) { //Do not move in backward direction
                if (!dfs(neighbor,node,visited)) {  //Visit all the neighbouring nodes
                    return false;
                }
            }
        }

        return true;
    }
}
