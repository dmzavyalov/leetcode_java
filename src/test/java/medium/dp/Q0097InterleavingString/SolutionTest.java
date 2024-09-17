package medium.dp.Q0097InterleavingString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertTrue(new Solution().isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }

    @Test
    void testTwo() {
        assertFalse(new Solution().isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }

    @Test
    void testThree() {
        assertTrue(new Solution().isInterleave("", "", ""));
    }
}