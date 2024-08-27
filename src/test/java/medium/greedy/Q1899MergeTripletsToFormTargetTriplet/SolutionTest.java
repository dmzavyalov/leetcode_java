package medium.greedy.Q1899MergeTripletsToFormTargetTriplet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertTrue(new Solution().mergeTriplets(new int[][]{{2,5,3}, {1,8,4}, {1,7,5}}, new int[] {2,7,5}));
    }

    @Test
    void testTwo() {
        assertFalse(new Solution().mergeTriplets(new int[][]{{3,4,5}, {4,5,6}}, new int[] {3,2,5}));
    }

    @Test
    void testThree() {
        assertTrue(new Solution().mergeTriplets(new int[][]{{2,5,3}, {2,3,4}, {1,2,5}, {5,2,3}}, new int[] {5,5,5}));
    }
}