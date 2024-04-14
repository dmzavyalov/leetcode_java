package hard.slidingWindow.Q0076MinimumWindowSubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals("BANC", new Solution().minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    void testTwo() {
        assertEquals("a", new Solution().minWindow("a", "a"));
    }

    @Test
    void testThree() {
        assertEquals("", new Solution().minWindow("a", "aa"));
    }
}