package easy.binarySearch.Q0704BinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testOne() {
        assertEquals(4, new Solution().search(new int[]{-1,0,3,5,9,12}, 9));
    }

    @Test
    void testTwo() {
        assertEquals(-1, new Solution().search(new int[]{-1,0,3,5,9,12}, 2));
    }
}
