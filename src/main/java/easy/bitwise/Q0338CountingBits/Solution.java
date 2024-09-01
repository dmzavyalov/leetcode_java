package easy.bitwise.Q0338CountingBits;

/*

https://leetcode.com/problems/counting-bits/description/

 */

public class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 1; i <= n; i++)
            result[i] = 1 + result[i & (i - 1)];
        return result;
    }
}
