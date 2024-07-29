package medium.dp.Q0091DecodeWays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(2, new Solution().numDecodings("12"));
    }

    @Test
    void testTwo() {
        assertEquals(3, new Solution().numDecodings("226"));
    }

    @Test
    void testThree() {
        assertEquals(0, new Solution().numDecodings("06"));
    }
}