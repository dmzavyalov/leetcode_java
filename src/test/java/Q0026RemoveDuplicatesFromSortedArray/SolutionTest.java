package Q0026RemoveDuplicatesFromSortedArray;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testOne() {
        var nums = new int[] {1, 1, 2};
        var solution = new Solution();
        var k = solution.removeDuplicates(nums);
        assertEquals(2, k);
        final var expected = new int[] { 1, 2};
        var actual = Arrays.copyOfRange(nums,0, k);
        assertArrayEquals(actual, expected);
    }

    @Test
    void testTwo() {
        var nums = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        var solution = new Solution();
        var k = solution.removeDuplicates(nums);
        assertEquals(5, k);
        final var expected = new int[] { 0, 1, 2, 3, 4};
        var actual = Arrays.copyOfRange(nums,0, k);
        assertArrayEquals(actual, expected);
    }

    @Test
    void testOneElement() {
        var nums = new int[] {0};
        var solution = new Solution();
        var k = solution.removeDuplicates(nums);
        assertEquals(1, k);
        final var expected = new int[] { 0 };
        var actual = Arrays.copyOfRange(nums,0, k);
        assertArrayEquals(actual, expected);
    }

    @Test
    void testAllRemain() {
        var nums = new int[] {1, 2, 3, 4};
        var solution = new Solution();
        var k = solution.removeDuplicates(nums);
        assertEquals(4, k);
        final var expected = new int[] { 1, 2, 3, 4 };
        var actual = Arrays.copyOfRange(nums,0, k);
        assertArrayEquals(actual, expected);
    }
}
