package medium.tree.Q0102BinaryTreeLevelOrderTraversal;

import helper.TreeHelper;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        var input = TreeHelper.arrayToTreeLevelOrder(new Integer[]{3,9,20,null,null,15,7});
        var output = new Solution().levelOrder(input);

        assertEquals(
            List.of(
                List.of(3),
                List.of(9,20),
                List.of(15,7)),
            output
        );
    }

    @Test
    void testTwo() {
        var input = TreeHelper.arrayToTreeLevelOrder(new Integer[]{1});
        var output = new Solution().levelOrder(input);
        assertEquals(List.of(List.of(1)), output);
    }

    @Test
    void testThree() {
        var input = TreeHelper.arrayToTreeLevelOrder(new Integer[]{});
        var output = new Solution().levelOrder(input);
        assertEquals(List.of(), output);
    }

}