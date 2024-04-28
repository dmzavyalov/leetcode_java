package medium.linkedList.Q0287FindDuplicateNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(2, new Solution().findDuplicate(new int[]{1,3,4,2,2}));
    }

    @Test
    void testTwo() {
        assertEquals(3, new Solution().findDuplicate(new int[]{3,1,3,4,2}));
    }

    @Test
    void testThree() {
        assertEquals(3, new Solution().findDuplicate(new int[]{3,3,3,3,3}));
    }

}