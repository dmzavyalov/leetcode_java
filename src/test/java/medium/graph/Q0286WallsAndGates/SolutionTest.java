package medium.graph.Q0286WallsAndGates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void testOne() {
        var rooms = new int[][]{
            {2147483647,-1,0,2147483647},
            {2147483647,2147483647,2147483647,-1},
            {2147483647,-1,2147483647,-1},
            {0,-1,2147483647,2147483647}
        };
        new Solution().wallsAndGates(rooms);
        assertArrayEquals(new int[][] {
            {3,-1,0,1},
            {2,2,1,-1},
            {1,-1,2,-1},
            {0,-1,3,4}
        }, rooms);
    }

    @Test
    void testTwo() {
        var rooms = new int[][]{{-1}};
        new Solution().wallsAndGates(rooms);
        assertArrayEquals(new int[][] {{-1}}, rooms);
    }

}