package medium.slidingWindow.Q0567PermutationInString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertTrue(new Solution().checkInclusion("ab", "eidbaooo"));
    }
    @Test
    void testTwo() {
        assertFalse(new Solution().checkInclusion("ab", "eidboaoo"));
    }
    @Test
    void testThree() {
        assertTrue(new Solution().checkInclusion("adc", "dcda"));
    }
}