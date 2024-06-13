package easy.tree.Q0110BalancedBinaryTree;

import dataStructures.TreeNode;
import helper.TreeHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        TreeNode input = TreeHelper.arrayToTreeLevelOrder(new Integer[] {3,9,20,null,null,15,7});
        assertTrue(new Solution().isBalanced(input));
    }

    @Test
    void testTwo() {
        TreeNode input = TreeHelper.arrayToTreeLevelOrder(new Integer[] {1,2,2,3,3,null,null,4,4});
        assertFalse(new Solution().isBalanced(input));
    }

    @Test
    void testThree() {
        TreeNode input = TreeHelper.arrayToTreeLevelOrder(new Integer[] {});
        assertTrue(new Solution().isBalanced(input));
    }
}