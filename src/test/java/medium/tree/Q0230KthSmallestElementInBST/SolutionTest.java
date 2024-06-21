package medium.tree.Q0230KthSmallestElementInBST;

import helper.TreeHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(1, new Solution().kthSmallest(TreeHelper.arrayToTreeLevelOrder(new Integer[]{3,1,4,null,2}), 1));
    }

    @Test
    void testTwo() {
        assertEquals(3, new Solution().kthSmallest(TreeHelper.arrayToTreeLevelOrder(new Integer[]{5,3,6,2,4,null,null,1}), 3));
    }
}