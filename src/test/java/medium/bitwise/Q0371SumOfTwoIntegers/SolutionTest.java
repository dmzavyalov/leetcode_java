package medium.bitwise.Q0371SumOfTwoIntegers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(3, new Solution().getSum(1, 2));
    }

    @Test
    void testTwo() {
        assertEquals(5, new Solution().getSum(2, 3));
    }
}