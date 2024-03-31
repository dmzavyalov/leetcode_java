package easy.twoPointers.Q0125ValidPalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    void testOne() {
        assertTrue(new Solution().isPalindrome("amanaplanacanalpanama"));
    }

    @Test
    void testTwo() {
        assertFalse(new Solution().isPalindrome("raceacar"));
    }

    @Test
    void testThree() {
        assertTrue(new Solution().isPalindrome(" "));
    }

    @Test
    void testFour() {
        assertTrue(new Solution().isPalindrome(".,"));
    }
}
