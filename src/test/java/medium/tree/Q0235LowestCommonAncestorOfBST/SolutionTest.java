package medium.tree.Q0235LowestCommonAncestorOfBST;

import dataStructures.TreeNode;
import helper.TreeHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(6, new Solution().lowestCommonAncestor(
            TreeHelper.arrayToTreeLevelOrder(new Integer[] {6,2,8,0,4,7,9,null,null,3,5}),
            new TreeNode(2),
            new TreeNode(8)
        ).val);
    }

    @Test
    void testTwo() {
        assertEquals(2, new Solution().lowestCommonAncestor(
            TreeHelper.arrayToTreeLevelOrder(new Integer[] {6,2,8,0,4,7,9,null,null,3,5}),
            new TreeNode(2),
            new TreeNode(4)
        ).val);
    }
}