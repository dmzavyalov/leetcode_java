package medium.math.Q0054SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/spiral-matrix/
 */


public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int lb = 0;
        int rb = matrix.length - 1;
        int tb = 0;
        int bb = matrix[0].length - 1;

        while (lb <= rb && tb <= bb) {
            for (int j = tb; j <= bb; j++) {
                result.add(matrix[lb][j]);
            }
            lb++;

            for (int i = lb; i <= rb; i++) {
                result.add(matrix[i][bb]);
            }
            bb--;

            if (lb <= rb) {
                for (int j = bb; j >= tb; j--) {
                    result.add(matrix[rb][j]);
                }
            }
            rb--;

            if (tb <= bb) {
                for (int i = rb; i >= lb; i--) {
                    result.add(matrix[i][tb]);
                }
            }
            tb++;
        }

        return result;
    }
}
