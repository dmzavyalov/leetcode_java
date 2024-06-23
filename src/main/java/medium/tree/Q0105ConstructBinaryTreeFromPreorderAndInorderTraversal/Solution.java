package medium.tree.Q0105ConstructBinaryTreeFromPreorderAndInorderTraversal;

import dataStructures.TreeNode;

import java.util.Arrays;

/*

https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

Array, Hash Table, Divide and Conquer, Tree, Binary Tree

 */

public class Solution {
//    private final Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length || preorder.length == 0) {
            return null;
        }

        //The first element in the pre-order traversal is always the root node
        var root = new TreeNode(preorder[0]);
        //In-order traversal tells us which elements go in the left subtree of the root, and which go to the right
        var mid = find(inorder, root.val);  //A simple linear search

        //A possible optimization would be to use a hash table value => position
        //But the submission result show that adding a map actually performs worse
//        for (int i = 0; i < inorder.length; i++) {
//            map.put(inorder[i], i);
//        }
//        var mid = map.get(root.val);

        //Elements that are to the left of the middle go to the left subtree
        root.left = buildTree(
            Arrays.copyOfRange(preorder, 1, mid + 1),
            Arrays.copyOfRange(inorder, 0, mid)
        );
        //Elements that are to the right of the middle go to the right subtree
        root.right = buildTree(
            Arrays.copyOfRange(preorder, mid + 1, preorder.length),
            Arrays.copyOfRange(inorder, mid + 1, inorder.length)
        );

        //This solution requires additional space for array copies
        //A possible optimization would be to pass upper and lower bounds down the recursive call chain

        return root;
    }

    private static int find(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
