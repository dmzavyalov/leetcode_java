package medium.math.Q0050Pow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(1024, new Solution().myPow(2,10), 0.000001);
    }

    @Test
    void testTwo() {
        assertEquals(9.26100, new Solution().myPow(2.1,3),0.000001);
    }

    @Test
    void testThree() {
        assertEquals(0.25, new Solution().myPow(2,-2), 0.000001);
    }
}