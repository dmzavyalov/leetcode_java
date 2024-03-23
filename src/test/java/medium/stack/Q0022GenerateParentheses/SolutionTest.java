package medium.stack.Q0022GenerateParentheses;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(
            List.of("((()))","(()())","(())()","()(())","()()()"),
            new Solution().generateParenthesis(3)
        );
    }

    @Test
    void testTwo() {
        assertEquals(
            List.of("()"),
            new Solution().generateParenthesis(1)
        );
    }
}
