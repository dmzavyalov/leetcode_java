package medium.tree.Q1448CountGoodNodesInBinaryTree;

import dataStructures.TreeNode;

/*
https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/

Tree, Depth-First Search, Breadth-First Search, Binary Tree

Time: O(n)
Space: O(log n)

 */

public class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }

    private int dfs(TreeNode node, int max) {
        if (node == null) {
            return 0;
        }
        var numGoodNodes = node.val >= max ? 1 : 0;
        max = Math.max(max, node.val);
        numGoodNodes += dfs(node.left, max);
        numGoodNodes += dfs(node.right, max);
        return numGoodNodes;
    }
}
