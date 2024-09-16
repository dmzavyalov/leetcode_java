package medium.dp.Q0494TargetSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(5, new Solution().findTargetSumWays(new int[] {1,1,1,1,1}, 3));
    }

    @Test
    void testTwo() {
        assertEquals(1, new Solution().findTargetSumWays(new int[] {1}, 1));
    }
}