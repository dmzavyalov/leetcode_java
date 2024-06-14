package easy.tree.Q0100SameTree;

import helper.TreeHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertTrue(new Solution().isSameTree(
            TreeHelper.arrayToTreeLevelOrder(new Integer[] {1,2,3}),
            TreeHelper.arrayToTreeLevelOrder(new Integer[] {1,2,3})
        ));
    }

    @Test
    void testTwo() {
        assertFalse(new Solution().isSameTree(
            TreeHelper.arrayToTreeLevelOrder(new Integer[] {1,2}),
            TreeHelper.arrayToTreeLevelOrder(new Integer[] {1,null,2})
        ));
    }

    @Test
    void testThree() {
        assertFalse(new Solution().isSameTree(
            TreeHelper.arrayToTreeLevelOrder(new Integer[] {1,2,1}),
            TreeHelper.arrayToTreeLevelOrder(new Integer[] {1,1,2})
        ));
    }

}