package helper;

import dataStructures.GraphNode;

import java.util.*;

public class AdjacencyListBuilder {
    public List<List<Integer>> build(GraphNode startNode) {
        if (null == startNode) {
            return new ArrayList<>();
        }

        //Helper structures
        Map<Integer, List<Integer>> adjListMap = new HashMap<>();
        Set<GraphNode> visited = new HashSet<>();

        //BFS
        Queue<GraphNode> queue = new LinkedList<>();
        queue.offer(startNode);
        visited.add(startNode);

        while (!queue.isEmpty()) {
            GraphNode node = queue.poll();
            adjListMap.putIfAbsent(node.val, new ArrayList<>());
            if (node.neighbors != null) {
                for (GraphNode neighbor : node.neighbors) {
                    adjListMap.get(node.val).add(neighbor.val);
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.offer(neighbor);
                    }
                }
            }
        }

        // Convert map to list of lists
        List<List<Integer>> adjList = new ArrayList<>();
        int maxNode = Collections.max(adjListMap.keySet());
        for (int i = 1; i <= maxNode; i++) {
            adjList.add(adjListMap.getOrDefault(i, new ArrayList<>()));
        }

        return adjList;
    }
}
