package medium.dp.Q0198HouseRobber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testOne() {
        assertEquals(4, new Solution().rob(new int[] {1,2,3,1}));
    }

    @Test
    void testTwo() {
        assertEquals(12, new Solution().rob(new int[] {2,7,9,3,1}));
    }
}