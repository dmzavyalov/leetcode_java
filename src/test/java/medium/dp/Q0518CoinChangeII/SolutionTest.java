package medium.dp.Q0518CoinChangeII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(4, new Solution().change(5, new int[]{1, 2, 5}));
    }

    @Test
    void testTwo() {
        assertEquals(0, new Solution().change(3, new int[]{2}));
    }

    @Test
    void testThree() {
        assertEquals(1, new Solution().change(10, new int[]{10}));
    }
}