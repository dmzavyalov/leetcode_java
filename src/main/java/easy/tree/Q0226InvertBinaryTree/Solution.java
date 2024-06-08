package easy.tree.Q0226InvertBinaryTree;

import dataStructures.TreeNode;

/*
https://leetcode.com/problems/invert-binary-tree/description/

Topics: Tree, Depth-First Search, Breadth-First Search, Binary Tree

Time: O(n)
Space: O(1)
 */

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;    //Base case
        }

        //Swap the children
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        //Recursive calls
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
