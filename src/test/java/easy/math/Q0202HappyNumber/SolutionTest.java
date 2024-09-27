package easy.math.Q0202HappyNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertTrue(new Solution().isHappy(19));
    }

    @Test
    void testTwo() {
        assertFalse(new Solution().isHappy(2));
    }
}