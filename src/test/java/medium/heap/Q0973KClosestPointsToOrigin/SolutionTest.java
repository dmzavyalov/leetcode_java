package medium.heap.Q0973KClosestPointsToOrigin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testOne() {
        assertArrayEquals(
            new int[][] {{-2,2}},
            new Solution().kClosest(new int[][] {{1,3},{-2,2}}, 1)
        );
    }

    @Test
    void testTwo() {
        assertArrayEquals(
            new int[][] {{3,3}, {-2,4}},
            new Solution().kClosest(new int[][] {{3,3}, {5,-1}, {-2,4}}, 2)
        );
    }

}