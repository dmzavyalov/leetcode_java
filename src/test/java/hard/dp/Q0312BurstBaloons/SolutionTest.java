package hard.dp.Q0312BurstBaloons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(167, new Solution().maxCoins(new int[]{3,1,5,8}));
    }

    @Test
    void testTwo() {
        assertEquals(10, new Solution().maxCoins(new int[]{1,5}));
    }
}