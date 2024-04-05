package medium.binarySearch.Q0074Search2DMatrix;

/*

https://leetcode.com/problems/search-a-2d-matrix/description/

Topics: Array, Binary Search, Matrix

Time: O(log m + log n)
Space: O(1)

 */

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        final int ROWS = matrix.length, COLS = matrix[0].length;

        //First binary search, look for the row containing the target number
        int top = 0, bottom = ROWS - 1;
        while (top <= bottom) {
            int midRow = top + (bottom - top) / 2;
            if (target > matrix[midRow][COLS - 1]) {
                top = midRow + 1;
            } else if (target < matrix[midRow][0]) {
                bottom = midRow - 1;
            } else {
                break;  //Found the row
            }
        }

        if (top > bottom) {
            return false;   //Looked through all the rows, didn't find target
        }

        //Second binary search, look for the column containing the target number
        int row = top + (bottom - top) / 2; //Reconstruct the middle row index we've found in the previous binary search
        int left = 0, right = COLS - 1;
        while (left <= right) {
            int midCol = left + (right - left) / 2;
            if (target > matrix[row][midCol]) {
                left = midCol + 1;
            } else if (target < matrix[row][midCol]) {
                right = midCol - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
