package medium.tree.Q0230KthSmallestElementInBST;

/*
https://leetcode.com/problems/kth-smallest-element-in-a-bst/

Tree, Depth-First Search, Breadth-First Search, Binary Tree

Time:
Space: O(log n)

 */

import dataStructures.TreeNode;

import java.util.LinkedList;

public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        //In-order traversal of a BST returns elements in sorted order

        int n = 0;
        var stack = new LinkedList<TreeNode>();
        var cur = root;

        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {   //Go as left as possible
                stack.push(cur);
                cur = cur.left;
            }

            //Process the node
            cur = stack.pop();
            n += 1;
            if (n == k) {
                return cur.val;
            }

            //Move on to the right subtree
            cur = cur.right;
        }

        return -1;  //Should not happen, it's guaranteed that k <= n
    }

}
