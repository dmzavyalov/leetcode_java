package medium.greedy.Q0678ValidParenthesisString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertTrue(new Solution().checkValidString("()"));
    }

    @Test
    void testTwo() {
        assertTrue(new Solution().checkValidString("(*)"));
    }

    @Test
    void testThree() {
        assertTrue(new Solution().checkValidString("(*))"));
    }
}