package easy.dp.Q0070ClimbingStairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(2, new Solution().climbStairs(2));
    }

    @Test
    void testTwo() {
        assertEquals(3, new Solution().climbStairs(3));
    }
}