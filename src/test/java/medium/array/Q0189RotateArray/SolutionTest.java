package medium.array.Q0189RotateArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testOne() {
        var nums = new int[] {1,2,3,4,5,6,7};
        var solution = new Solution();
        solution.rotate(nums, 3);
        var expected = new int[] {5,6,7,1,2,3,4};
        assertArrayEquals(expected, nums);
    }

    @Test
    void testTwo() {
        var nums = new int[] {-1,-100,3,99};
        var solution = new Solution();
        solution.rotate(nums, 2);
        var expected = new int[] {3,99,-1,-100};
        assertArrayEquals(expected, nums);
    }

    @Test
    void testKGreaterThanArrayLen() {
        var nums = new int[] {1,2,3,4,5,6,7};
        var solution = new Solution();
        solution.rotate(nums, 9);
        var expected = new int[] {6,7,1,2,3,4,5};
        assertArrayEquals(expected, nums);
    }

    @Test
    void testKZero() {
        var nums = new int[] {1,2,3,4,5,6,7};
        var solution = new Solution();
        solution.rotate(nums, 0);
        var expected = new int[] {1,2,3,4,5,6,7};
        assertArrayEquals(expected, nums);
    }
}
