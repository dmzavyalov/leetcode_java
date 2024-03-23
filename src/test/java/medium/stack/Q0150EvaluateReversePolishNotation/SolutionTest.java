package medium.stack.Q0150EvaluateReversePolishNotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(9, new Solution().evalRPN(new String[] {"2","1","+","3","*"}) );
    }

    @Test
    void testTwo() {
        assertEquals(6, new Solution().evalRPN(new String[] {"4","13","5","/","+"}) );
    }

    @Test
    void testThree() {
        assertEquals(22, new Solution().evalRPN(new String[] {"10","6","9","3","+","-11","*","/","*","17","+","5","+"}) );
    }
}
