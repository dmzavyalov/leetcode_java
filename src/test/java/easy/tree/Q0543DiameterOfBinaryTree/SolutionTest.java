package easy.tree.Q0543DiameterOfBinaryTree;

import dataStructures.TreeNode;
import helper.TreeHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        TreeNode input = TreeHelper.arrayToTreeLevelOrder(new Integer[] {1,2,3,4,5});
        assertEquals(3, new Solution().diameterOfBinaryTree(input));
    }

    @Test
    void testTwo() {
        TreeNode input = TreeHelper.arrayToTreeLevelOrder(new Integer[] {1,2});
        assertEquals(1, new Solution().diameterOfBinaryTree(input));
    }
}