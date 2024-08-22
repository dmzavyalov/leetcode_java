package medium.greedy.Q0053MaximumSubarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(6, new Solution().maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    }

    @Test
    void testTwo() {
        assertEquals(1, new Solution().maxSubArray(new int[] {1}));
    }

    @Test
    void testThree() {
        assertEquals(23, new Solution().maxSubArray(new int[] {5,4,-1,7,8}));
    }
}