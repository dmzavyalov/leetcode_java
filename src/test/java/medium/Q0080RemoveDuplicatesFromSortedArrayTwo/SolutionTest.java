package medium.Q0080RemoveDuplicatesFromSortedArrayTwo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void testOne() {
        var nums = new int[] {1, 1, 1, 2, 2, 3};
        var solution = new Solution();
        var k = solution.removeDuplicates(nums);
        assertEquals(5, k);
        final var expected = new int[] {1, 1, 2, 2, 3};
        var actual = Arrays.copyOfRange(nums,0, k);
        assertArrayEquals(actual, expected);
    }

    @Test
    void testTwo() {
        var nums = new int[] {0, 0, 1, 1, 1, 1, 2, 3, 3};
        var solution = new Solution();
        var k = solution.removeDuplicates(nums);
        assertEquals(7, k);
        final var expected = new int[] {0, 0, 1, 1, 2, 3, 3};
        var actual = Arrays.copyOfRange(nums,0, k);
        assertArrayEquals(actual, expected);
    }
}
