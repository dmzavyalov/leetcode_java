package hard.dp.Q0010RegularExpressionMatching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertFalse(new Solution().isMatch("aa", "a"));
    }

    @Test
    void testTwo() {
        assertTrue(new Solution().isMatch("aa", "a*"));
    }

    @Test
    void testThree() {
        assertTrue(new Solution().isMatch("ab", ".*"));
    }
}