package medium.stack.Q0155MinStack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinStackTest {

    @Test
    void testOne() {
        var stack = new MinStack();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        assertEquals(-3, stack.getMin());
        stack.pop();
        assertEquals(0, stack.top());
        assertEquals(-2, stack.getMin());
    }

    @Test
    void testTwo () {
        var stack = new MinStack();
        stack.push(2);
        stack.push(0);
        stack.push(3);
        stack.push(0);
        assertEquals(0, stack.getMin());
        stack.pop();
        assertEquals(0, stack.getMin());
        stack.pop();
        assertEquals(0, stack.getMin());
        stack.pop();
        assertEquals(2, stack.getMin());
    }
}
