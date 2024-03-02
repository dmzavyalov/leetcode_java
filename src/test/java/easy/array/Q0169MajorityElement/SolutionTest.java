package easy.array.Q0169MajorityElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testOne() {
        var nums = new int[] {3,2,3};
        var solution = new Solution();
        var actual = solution.majorityElement(nums);
        assertEquals(3, actual);
    }

    @Test
    void testTwo() {
        var nums = new int[] {2,2,1,1,1,2,2};
        var solution = new Solution();
        var actual = solution.majorityElement(nums);
        assertEquals(2, actual);
    }
}
