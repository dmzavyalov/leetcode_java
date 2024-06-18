package medium.tree.Q0199BinaryTreeRightSideView;

/*
https://leetcode.com/problems/binary-tree-right-side-view/description/

Tree, Depth-First Search, Breadth-First Search, Binary Tree

Time: O(N)
Space: O(N)

 */

import dataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        var result = new ArrayList<Integer>();

        //Essentially this is level-order traversal
        List<TreeNode> queue = new ArrayList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            var levelLen = queue.size();
            //In which we add to the final result only the rightmost node on each level
            TreeNode levelRightmostNode = null;
            for (int i = 0; i < levelLen; i++) {
                var node = queue.removeFirst();
                if (node != null) {
                    levelRightmostNode = node;
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
            if (levelRightmostNode != null) {
                result.add(levelRightmostNode.val);
            }
        }

        return result;
    }
}
