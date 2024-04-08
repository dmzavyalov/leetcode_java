package medium.slidingWindow.Q0003LongestSubstringWithoutRepeatingCharacters.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(3, new Solution().lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void testTwo() {
        assertEquals(1, new Solution().lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void testThree() {
        assertEquals(3, new Solution().lengthOfLongestSubstring("pwwkew"));
    }
}