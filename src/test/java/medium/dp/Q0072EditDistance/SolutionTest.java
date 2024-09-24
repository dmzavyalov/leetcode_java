package medium.dp.Q0072EditDistance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(3, new Solution().minDistance("horse", "ros"));
    }

    @Test
    void testTwo() {
        assertEquals(5, new Solution().minDistance("intention", "execution"));
    }
}