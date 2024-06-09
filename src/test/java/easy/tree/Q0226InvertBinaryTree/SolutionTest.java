package easy.tree.Q0226InvertBinaryTree;

import dataStructures.TreeNode;
import helper.TreeHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testOne() {
        TreeNode input = TreeHelper.arrayToTreeLevelOrder(new Integer[] {4,2,7,1,3,6,9});
        TreeNode output = new Solution().invertTree(input);

        assertArrayEquals(
            TreeHelper.treeToArrayLevelOrder(output),
            new Integer[]{4,7,2,9,6,3,1}
        );
    }

    @Test
    void testTwo() {
        TreeNode input = TreeHelper.arrayToTreeLevelOrder(new Integer[] {2,1,3});
        TreeNode output = new Solution().invertTree(input);

        assertArrayEquals(
            TreeHelper.treeToArrayLevelOrder(output),
            new Integer[]{2,3,1}
        );
    }

    @Test
    void testThree() {
        TreeNode input = TreeHelper.arrayToTreeLevelOrder(new Integer[] {});
        TreeNode output = new Solution().invertTree(input);

        assertArrayEquals(
            TreeHelper.treeToArrayLevelOrder(output),
            new Integer[]{}
        );
    }
}