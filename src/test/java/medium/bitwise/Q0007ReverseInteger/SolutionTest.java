package medium.bitwise.Q0007ReverseInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(321, new Solution().reverse(123));
    }

    @Test
    void testTwo() {
        assertEquals(-321, new Solution().reverse(-123));
    }

    @Test
    void testThree() {
        assertEquals(21, new Solution().reverse(120));
    }
}