package medium.graph.Q0133CloneGraph;

import helper.GraphHelper;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        var inputAdjacencyList = List.of(
            List.of(2,4),
            List.of(1,3),
            List.of(2,4),
            List.of(1,3)
        );
        var inputGraph = GraphHelper.adjacencyListToGraph(inputAdjacencyList);
        var outputGraph = new Solution().cloneGraph(inputGraph);
        var outputAdjacencyList = GraphHelper.graphToAdjacencyList(outputGraph);
        assertEquals(inputAdjacencyList, outputAdjacencyList);
    }

    @Test
    void testTwo() {
        var inputAdjacencyList = List.of((List<Integer>)new ArrayList<Integer>());
        var inputGraph = GraphHelper.adjacencyListToGraph(inputAdjacencyList);
        var outputGraph = new Solution().cloneGraph(inputGraph);
        var outputAdjacencyList = GraphHelper.graphToAdjacencyList(outputGraph);
        assertEquals(inputAdjacencyList, outputAdjacencyList);
    }

    @Test
    void testThree() {
        List<List<Integer>> inputAdjacencyList = new ArrayList<>();
        var inputGraph = GraphHelper.adjacencyListToGraph(inputAdjacencyList);
        var outputGraph = new Solution().cloneGraph(inputGraph);
        var outputAdjacencyList = GraphHelper.graphToAdjacencyList(outputGraph);
        assertEquals(inputAdjacencyList, outputAdjacencyList);
    }
}