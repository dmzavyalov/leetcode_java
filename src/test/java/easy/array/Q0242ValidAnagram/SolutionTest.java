package easy.array.Q0242ValidAnagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void testOne() {
        var solution = new Solution();
        assertTrue(solution.isAnagram("anagram", "nagaram"));
    }

    @Test
    void testTwo() {
        var solution = new Solution();
        assertFalse(solution.isAnagram("rat", "car"));
    }
}
