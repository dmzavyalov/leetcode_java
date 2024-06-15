package easy.tree.Q0100SameTree;

import dataStructures.TreeNode;

/*
https://leetcode.com/problems/same-tree/

Tree, Depth-First Search, Breadth-First Search, Binary Tree

Time: O(p+q)
Space: O(max height), to hold recursive stack call
 */

public class  Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
