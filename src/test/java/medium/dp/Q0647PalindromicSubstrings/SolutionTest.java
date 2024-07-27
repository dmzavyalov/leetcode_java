package medium.dp.Q0647PalindromicSubstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(3, new Solution().countSubstrings("abc"));
    }

    @Test
    void testTwo() {
        assertEquals(6, new Solution().countSubstrings("aaa"));
    }
}