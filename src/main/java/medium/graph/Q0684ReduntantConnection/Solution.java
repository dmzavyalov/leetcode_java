package medium.graph.Q0684ReduntantConnection;

/*

https://leetcode.com/problems/redundant-connection/

 */

public class Solution {
    private int[] parent;

    public int[] findRedundantConnection(int[][] edges) {
        parent = new int[edges.length];
        for (int i = 0; i < edges.length; i++) {
            parent[i] = i + 1;  //Node numeration start from 1
        }

        for (int[] edge: edges) {
            if (find(edge[0]) == find(edge[1])) {
                //Two nodes already have the same parent and so belong to the same connected subgraph
                //Another connection between them would be redundant
                return edge;
            } else {
                union(edge[0], edge[1]);
            }
        }

        return new int[2];
    }

    private int find(int x) {
        if (x == parent[x - 1]) {
            return x;
        } else {
            return find(parent[x-1]);
        }
    }

    private void union(int x, int y) {
        parent[find(y) - 1] = find(x);
    }
}
