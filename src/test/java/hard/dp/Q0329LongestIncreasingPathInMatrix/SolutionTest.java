package hard.dp.Q0329LongestIncreasingPathInMatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(4, new Solution().longestIncreasingPath(new int[][]{{9,9,4},{6,6,8},{2,1,1}}));
    }

    @Test
    void testTwo() {
        assertEquals(4, new Solution().longestIncreasingPath(new int[][]{{3,4,5},{3,2,6},{2,2,1}}));
    }

    @Test
    void testThree() {
        assertEquals(1, new Solution().longestIncreasingPath(new int[][]{{1}}));
    }
}