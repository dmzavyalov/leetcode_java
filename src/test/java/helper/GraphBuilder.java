package helper;

import dataStructures.GraphNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphBuilder {
    private Map<Integer, GraphNode> nodeMap = new HashMap<>();

    public GraphNode build(List<List<Integer>> adjacencyList) {
        if (null == adjacencyList || adjacencyList.isEmpty()) {
            return null;
        }

        for (int i = 0; i < adjacencyList.size(); i++) {
            int nodeVal = i + 1;
            var node = getNode(nodeVal);
            for (var neighborVal : adjacencyList.get(i)) {
                var neighborNode = getNode(neighborVal);
                if (node.neighbors == null) {
                    node.neighbors = new ArrayList<>();
                }
                node.neighbors.add(neighborNode);
            }
        }

        return getNode(1);
    }

    private GraphNode getNode(int val) {
        return nodeMap.computeIfAbsent(val, GraphNode::new);
    }
}
