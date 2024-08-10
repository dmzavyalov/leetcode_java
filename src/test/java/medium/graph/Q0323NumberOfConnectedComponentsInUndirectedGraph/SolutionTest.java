package medium.graph.Q0323NumberOfConnectedComponentsInUndirectedGraph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(1, new Solution().countComponents(3, new int[][]{{0,1},{0,2}}));
    }

    @Test
    void testTwo() {
        assertEquals(2, new Solution().countComponents(6, new int[][]{{0,1},{1,2},{2,3},{4,5}}));
    }
}