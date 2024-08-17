package medium.interval.Q0056MergeIntervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertArrayEquals(
            new int[][] {{1,6},{8,10},{15,18}},
            new Solution().merge(new int[][]{{1,3},{2,6},{8,10},{15,18}})
        );
    }

    @Test
    void testTwo() {
        assertArrayEquals(
            new int[][] {{1,5}},
            new Solution().merge(new int[][]{{1,4},{4,5}})
        );
    }
}