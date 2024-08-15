package medium.dp.Q0416PartitionEqualSubsetSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertTrue(new Solution().canPartition(new int[] {1,5,11,5}));
    }

    @Test
    void testTwo() {
        assertFalse(new Solution().canPartition(new int[] {1,2,3,5}));
    }
}