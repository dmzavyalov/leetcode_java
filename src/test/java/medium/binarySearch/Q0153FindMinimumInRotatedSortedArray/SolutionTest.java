package medium.binarySearch.Q0153FindMinimumInRotatedSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testOne() {
        assertEquals(1, new Solution().findMin(new int[]{3,4,5,1,2}));
    }

    @Test
    void testTwo() {
        assertEquals(0, new Solution().findMin(new int[]{4,5,6,7,0,1,2}));
    }

    @Test
    void testThree() {
        assertEquals(11, new Solution().findMin(new int[]{11,13,15,17}));
    }

    @Test
    void testFour() {
        assertEquals(1, new Solution().findMin(new int[]{2,1}));
    }

}
