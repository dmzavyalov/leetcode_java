package easy.dp.Q0746MinCostClimbingStairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(15, new Solution().minCostClimbingStairs(new int[]{10,15,20}));
    }

    @Test
    void testTwo() {
        assertEquals(6, new Solution().minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }
}