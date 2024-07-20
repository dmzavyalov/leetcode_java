package helper;

import dataStructures.GraphNode;

import java.util.List;

public class GraphHelper {
    public static GraphNode adjacencyListToGraph(List<List<Integer>> adjacencyList) {
        return new GraphBuilder().build(adjacencyList);
    }

    public static List<List<Integer>> graphToAdjacencyList(GraphNode startNode) {
        return new AdjacencyListBuilder().build(startNode);
    }
}
