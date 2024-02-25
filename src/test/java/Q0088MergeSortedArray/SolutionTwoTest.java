package Q0088MergeSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTwoTest {

    @Test
    void testOne() {
        var nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        final int m = 3;
        final var nums2 = new int[] { 2, 5, 6 };
        final int n = 3;

        final var solution = new SolutionTwo();
        solution.merge(nums1, m, nums2, n);
        final var expected = new int[] { 1, 2, 2, 3, 5, 6};
        assertArrayEquals(nums1, expected);
    }

    @Test
    void testTwo() {
        var nums1 = new int[] { 1 };
        final int m = 1;
        final var nums2 = new int[] { };
        final int n = 0;

        final var solution = new SolutionTwo();
        solution.merge(nums1, m, nums2, n);
        final var expected = new int[] { 1 };
        assertArrayEquals(nums1, expected);
    }

    @Test
    void testThree() {
        var nums1 = new int[] { 0 };
        final int m = 0;
        final var nums2 = new int[] { 1 };
        final int n = 1;

        final var solution = new SolutionTwo();
        solution.merge(nums1, m, nums2, n);
        final var expected = new int[] { 1 };
        assertArrayEquals(nums1, expected);
    }

}
