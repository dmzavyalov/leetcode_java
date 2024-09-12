package medium.dp.Q0309BestTimeToBuyAndSellStockWithCooldown;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(3, new Solution().maxProfit(new int[] {1,2,3,0,2}));
    }

    @Test
    void testTwo() {
        assertEquals(0, new Solution().maxProfit(new int[] {1}));
    }
}