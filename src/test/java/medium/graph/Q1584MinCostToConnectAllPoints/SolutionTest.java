package medium.graph.Q1584MinCostToConnectAllPoints;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(20, new Solution().minCostConnectPoints(new int[][]{{0,0},{2,2},{3,10},{5,2},{7,0}}));
    }

    @Test
    void testTwo() {
        assertEquals(18, new Solution().minCostConnectPoints(new int[][]{{3,12},{-2,5},{-4,1}}));
    }
}