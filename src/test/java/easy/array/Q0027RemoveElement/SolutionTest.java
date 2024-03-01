package easy.array.Q0027RemoveElement;

import easy.array.Q0027RemoveElement.Solution;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testOne() {
        var nums = new int[] {3, 2, 2, 3};
        final var val = 3;
        final var expectedK = 2;
        final var expectedNums =  new int[] {2, 2};
        verify(nums, val, expectedK,  expectedNums);
    }

    @Test
    void testTwo() {
        var nums = new int[] {0, 1, 2, 2, 3, 0, 4, 2};
        final var val = 2;
        final var expectedK = 5;
        final var expectedNums =  new int[] {0, 0, 1, 3, 4};
        verify(nums, val, expectedK,  expectedNums);
    }

    @Test
    void testEmptyArray() {
        var nums = new int[] {};
        final var val = 2;
        final var expectedK = 0;
        final var expectedNums =  new int[] {};
        verify(nums, val, expectedK,  expectedNums);
    }

    @Test
    void testRemoveAll() {
        var nums = new int[] {7, 7, 7};
        final var val = 7;
        final var expectedK = 0;
        final var expectedNums =  new int[] {};
        verify(nums, val, expectedK,  expectedNums);
    }

    @Test
    void testRemoveNone() {
        var nums = new int[] {0, 1, 2, 2, 3, 0, 4, 2};
        final var val = 14;
        final var expectedK = 8;
        final var expectedNums =  new int[] {0, 0, 1, 2, 2, 2, 3, 4};
        verify(nums, val, expectedK,  expectedNums);
    }

    private void verify(int[] nums, int val, int expectedK, int[] expectedNums) {
        final var solution = new Solution();

        int actualK = solution.removeElement(nums, val);

        assertEquals(expectedK, actualK);

        var actualNums = Arrays.copyOfRange(nums,0, expectedK);
        Arrays.sort(actualNums);
        assertArrayEquals(actualNums, expectedNums);
    }
}
