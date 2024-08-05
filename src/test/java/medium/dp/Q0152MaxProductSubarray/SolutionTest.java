package medium.dp.Q0152MaxProductSubarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testOne() {
        assertEquals(6, new Solution().maxProduct(new int[]{2,3,-2,4}));
    }

    @Test
    void testTwo() {
        assertEquals(0, new Solution().maxProduct(new int[]{-2,0,-1}));
    }

    @Test
    void testThree() {
        assertEquals(1000000000, new Solution().maxProduct(new int[]{0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0}));
    }
}