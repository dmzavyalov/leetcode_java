package hard.tree.Q0297SerializeAndDeserializeBinaryTree;

import dataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*

https://leetcode.com/problems/serialize-and-deserialize-binary-tree/

String, Tree, Depth-First Search, Breadth-First Search, Design, Binary Tree

 */

public class Codec {
    private final String DELIMITER = ",";
    private final String NULL = "N";

    private List<String> serializationResult = new ArrayList<>();
    private String[] deserializationData;
    private int deserializationIndex;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        serializeDfs(root);
        return String.join(DELIMITER , serializationResult);
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        deserializationData = data.split(DELIMITER);
        deserializationIndex = 0;
        return deserializeDfs();
    }

    private void serializeDfs(TreeNode node) {
        if (node == null) {
            serializationResult.add(NULL);
        } else {
            serializationResult.add(String.valueOf(node.val));
            serializeDfs(node.left);
            serializeDfs(node.right);
        }
    }

    private TreeNode deserializeDfs() {
        if (deserializationData[deserializationIndex].equals(NULL)) {
            deserializationIndex++;
            return null;
        }
        var node = new TreeNode(Integer.parseInt(deserializationData[deserializationIndex]));
        deserializationIndex++;
        node.left = deserializeDfs();
        node.right = deserializeDfs();
        return node;
    }
}
