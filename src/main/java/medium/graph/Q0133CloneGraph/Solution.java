package medium.graph.Q0133CloneGraph;

import dataStructures.GraphNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*

https://leetcode.com/problems/clone-graph/description/

Hash Table, Depth-First Search, Breadth-First Search, Graph

Time: O(V + E)

 */

public class Solution {
    private final Map<Integer, GraphNode> map = new HashMap<>();

    public GraphNode cloneGraph(GraphNode node) {
        if (node == null) {
            return null;
        }

        if (map.containsKey(node.val)) {
            return map.get(node.val);
        }

        var newNode = new GraphNode(node.val, new ArrayList<>());
        map.put(node.val, newNode);
        if (null != node.neighbors) {
            for (GraphNode neighbor : node.neighbors) {
                newNode.neighbors.add(cloneGraph(neighbor));
            }
        }
        return newNode;
    }
}
