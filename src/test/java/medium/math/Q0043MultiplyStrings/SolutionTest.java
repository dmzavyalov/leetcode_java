package medium.math.Q0043MultiplyStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals("6", new Solution().multiply("2", "3"));
    }

    @Test
    void testTwo() {
        assertEquals("56088", new Solution().multiply("123", "456"));
    }

    @Test
    void testThree() {
        assertEquals("81", new Solution().multiply("9", "9"));
    }

}