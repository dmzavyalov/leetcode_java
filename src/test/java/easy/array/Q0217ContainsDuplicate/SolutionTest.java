package easy.array.Q0217ContainsDuplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    void testOne() {
        assertTrue(new Solution().containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    void testTwo() {
        assertFalse(new Solution().containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    @Test
    void testThree() {
        assertTrue(new Solution().containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}
