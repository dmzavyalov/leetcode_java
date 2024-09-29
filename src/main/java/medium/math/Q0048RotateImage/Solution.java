package medium.math.Q0048RotateImage;

/*
https://leetcode.com/problems/rotate-image/
 */


public class Solution {
    public void rotate(int[][] matrix) {
        int l = 0, r = matrix.length - 1;

        while (l < r) {
            for (int i = 0; i < r - l; i++) {
                int top = l;
                int bottom = r;

                //Rotate reverse clockwise
                int topLeft = matrix[top][l + i];
                matrix[top][l + i] = matrix[bottom - i][l];     //bottom left -> top left
                matrix[bottom - i][l] = matrix[bottom][r - i];  //bottom right -> bottom left
                matrix[bottom][r - i] = matrix[top + i][r];     //top right -> bottom right
                matrix[top + i][r] = topLeft;                   //top left -> top right
            }
            r--;
            l++;
        }
    }
}
