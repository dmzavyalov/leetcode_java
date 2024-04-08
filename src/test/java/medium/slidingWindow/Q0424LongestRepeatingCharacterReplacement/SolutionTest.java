package medium.slidingWindow.Q0424LongestRepeatingCharacterReplacement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(4, new Solution().characterReplacement("ABAB", 2));
    }

    @Test
    void testTwo() {
        assertEquals(4, new Solution().characterReplacement("AABABBA", 1));
    }
}