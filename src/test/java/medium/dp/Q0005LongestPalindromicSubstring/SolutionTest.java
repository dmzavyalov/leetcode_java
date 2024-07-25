package medium.dp.Q0005LongestPalindromicSubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testOne() {
        assertEquals("bab", new Solution().longestPalindrome("babad"));
    }

    @Test
    void testTwo() {
        assertEquals("bb", new Solution().longestPalindrome("cbbd"));
    }
}