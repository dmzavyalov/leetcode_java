package medium.tree.Q0102BinaryTreeLevelOrderTraversal;

/*
https://leetcode.com/problems/binary-tree-level-order-traversal/description/

Tree, Breadth-First Search, Binary Tree

Time: O(N)
Space: O(N)

 */

import dataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        var result = new ArrayList<List<Integer>>();

        List<TreeNode> queue = new ArrayList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            var levelLen = queue.size();
            var level = new ArrayList<Integer>();
            for (int i = 0; i < levelLen; i++) {
                var node = queue.removeFirst();
                if (node != null) {
                    level.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
            if (!level.isEmpty()) {
                result.add(level);
            }
        }

        return result;
    }
}
