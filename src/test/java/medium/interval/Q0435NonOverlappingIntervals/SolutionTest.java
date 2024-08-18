package medium.interval.Q0435NonOverlappingIntervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(1, new Solution().eraseOverlapIntervals(new int[][] {{1,2},{2,3},{3,4},{1,3}}));
    }

    @Test
    void testTwo() {
        assertEquals(2, new Solution().eraseOverlapIntervals(new int[][] {{1,2},{1,2},{1,2}}));
    }

    @Test
    void testThree() {
        assertEquals(0, new Solution().eraseOverlapIntervals(new int[][] {{1,2},{2,3}}));
    }
}