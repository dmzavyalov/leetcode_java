package medium.graph.Q0684ReduntantConnection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testOne() {
        assertArrayEquals(new int[] {2,3}, new Solution().findRedundantConnection(new int[][]{{1,2},{1,3},{2,3}}));
    }

    @Test
    void testTwo() {
        assertArrayEquals(new int[] {1,4}, new Solution().findRedundantConnection(new int[][]{{1,2},{2,3},{3,4},{1,4},{1,5}}));
    }
}