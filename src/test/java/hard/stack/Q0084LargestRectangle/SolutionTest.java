package hard.stack.Q0084LargestRectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void testOne() {
        assertEquals(10, new Solution().largestRectangleArea(new int[] {2,1,5,6,2,3}));
    }

    @Test
    void testTwo() {
        assertEquals(4, new Solution().largestRectangleArea(new int[] {2,4}));
    }
}
