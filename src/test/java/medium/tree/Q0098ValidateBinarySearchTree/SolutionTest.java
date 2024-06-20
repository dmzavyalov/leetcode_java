package medium.tree.Q0098ValidateBinarySearchTree;

import helper.TreeHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertTrue(new Solution().isValidBST(TreeHelper.arrayToTreeLevelOrder(new Integer[]{2,1,3})));
    }

    @Test
    void testTwo() {
        assertFalse(new Solution().isValidBST(TreeHelper.arrayToTreeLevelOrder(new Integer[]{5,1,4,null,null,3,6})));
    }

    @Test
    void testThree() {
        assertTrue(new Solution().isValidBST(TreeHelper.arrayToTreeLevelOrder(new Integer[]{2147483647})));
    }
}