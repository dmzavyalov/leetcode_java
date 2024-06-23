package helper;

import dataStructures.TreeNode;

import java.util.*;

public class TreeHelper {
    public static TreeNode arrayToTreeLevelOrder(Integer[] values) {
        if (values == null || values.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (i < values.length) {
            TreeNode node = queue.poll();

            node.left = values[i] != null ?  new TreeNode(values[i]) : null;
            i++;
            if (node.left != null) {
                queue.add(node.left);
            }

            if (i < values.length) {
                node.right = values[i] != null ?  new TreeNode(values[i]) : null;
                i++;
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        return root;
    }

    public static Integer[] treeToArrayLevelOrder(TreeNode root) {
        if (root == null) {
            return new Integer[]{};
        }

        List<Integer> result = new ArrayList<>();
        List<TreeNode> queue = new LinkedList<>();
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
                } else {
                    level.add(null);
                }
            }
            if (level.stream().anyMatch(Objects::nonNull)) {
                result.addAll(level);
            }
        }

        return result.toArray(Integer[]::new);
    }
}
