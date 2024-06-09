package easy.tree.Q0104MaximumDepthOfBinaryTree;

import dataStructures.TreeNode;

/*

https://leetcode.com/problems/maximum-depth-of-binary-tree/

Topics: Tree, Depth-First Search, Breadth-First Search, Binary Tree

Time: O(n)
Space: O(n)

 */

public class SolutionRecursiveDFS {
    public int maxDepth(TreeNode root) {
        return root == null ?
            0 : //Base case
            1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
