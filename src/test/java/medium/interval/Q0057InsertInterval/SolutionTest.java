package medium.interval.Q0057InsertInterval;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertArrayEquals(
            new int[][] {{1,5},{6,9}},
            new Solution().insert(new int[][]{{1,3},{6,9}}, new int[]{2,5})
        );
    }

    @Test
    void testTwo() {
        assertArrayEquals(
            new int[][] {{1,2},{3,10},{12,16}},
            new Solution().insert(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4,8})
        );
    }

}