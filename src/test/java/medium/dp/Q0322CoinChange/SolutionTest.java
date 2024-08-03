package medium.dp.Q0322CoinChange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testOne() {
        assertEquals(3, new Solution().coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    void testTwo() {
        assertEquals(-1, new Solution().coinChange(new int[]{2}, 3));
    }

    @Test
    void testThree() {
        assertEquals(0, new Solution().coinChange(new int[]{1}, 0));
    }
}