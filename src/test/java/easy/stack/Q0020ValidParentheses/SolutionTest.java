package easy.stack.Q0020ValidParentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    @Test
    void testOne() {
        assertTrue(new Solution().isValid("()"));
    }

    @Test
    void testTwo() {
        assertTrue(new Solution().isValid("()[]{}"));
    }

    @Test
    void testThree() {
        assertFalse(new Solution().isValid("(]"));
    }

    @Test
    void testFour() {
        assertFalse(new Solution().isValid("([)]"));
    }
}
