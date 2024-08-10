package medium.graph.Q0323NumberOfConnectedComponentsInUndirectedGraph;

/*

https://www.lintcode.com/problem/3651/

 */

public class Solution {
    private int[] parent;
    private int[] rank;

    //Union find
    public int countComponents(int n, int[][] edges) {
        parent = new int[n];
        rank = new int[n];

        //We start with each node on their own, making n components
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
        }

        int result = n;

        //For each edge when we merge together two components (make union)
        //we decrement the number of components by one
        for (int[] edge : edges) {
            result -= union(edge[0], edge[1]);
        }

        return result;
    }

    //Find parent of the node
    //Nodes that have no parent are marked as parents of themselves
    private int find(int node) {
        int result = node;
        while(parent[result] != result) {
            parent[result] = parent[parent[result]];
            result = parent[result];
        }
        return result;
    }

    private int union(int n1, int n2) {
        int p1 = find(n1);
        int p2 = find(n2);

        //The nodes already belong to the same component
        if (p1 == p2) {
            return 0;
        }

        //We merge smaller component into the larger one
        if (rank[p2] > rank[p1]) {
            parent[p1] = p2;
            rank[p2] += rank[p1];
        } else {
            parent[p2] = p1;
            rank[p1] += rank[p2];
        }

        return 1;
    }
}
