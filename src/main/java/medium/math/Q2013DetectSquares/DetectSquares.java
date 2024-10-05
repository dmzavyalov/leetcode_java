package medium.math.Q2013DetectSquares;


/*
https://leetcode.com/problems/detect-squares/
 */

class DetectSquares {
    private Integer[][] matrix;
    private final int PLANE_SIZE = 1000;

    public DetectSquares() {
        matrix = new Integer[PLANE_SIZE + 1][PLANE_SIZE + 1];
    }

    public void add(int[] point) {
        if (matrix[point[0]][point[1]] == null) {
            matrix[point[0]][point[1]] = 1;
        } else {
            //Points that share coordinates remain distinct
            matrix[point[0]][point[1]] = matrix[point[0]][point[1]] + 1;
        }
    }

    public int count(int[] point) {
        int currentSquareCount = 0;
        int currentPointCount = 1;
        int startRow = point[0];
        int startCol = point[1];
        int curRow = point[0];
        int curCol = point[1];

        //Move diagonally
        while (curRow-- != 0 && curCol-- != 0) {
            if (hasPoint(curRow, curCol, startRow, startCol)) {
                currentSquareCount += getSquareCount(currentPointCount, curRow, curCol, startRow, startCol);
            }
        }

        //Move diagonally in the opposite direction
        curRow = point[0];
        curCol = point[1];
        while (curRow++ != PLANE_SIZE && curCol++ != PLANE_SIZE) {
            if (hasPoint(curRow, curCol, startRow, startCol)) {
                currentSquareCount += getSquareCount(currentPointCount, curRow, curCol, startRow, startCol);
            }
        }

        //Move along reverse diagonal
        curRow = point[0];
        curCol = point[1];
        while (curRow-- != 0 && curCol++ != PLANE_SIZE) {
            if (hasPoint(curRow, curCol, startRow, startCol)) {
                currentSquareCount += getSquareCount(currentPointCount, curRow, curCol, startRow, startCol);
            }
        }

        //Move along reverse diagonal in the opposite direction
        curRow = point[0];
        curCol = point[1];
        while (curRow++ != PLANE_SIZE && curCol-- != 0) {
            if (hasPoint(curRow, curCol, startRow, startCol)) {
                currentSquareCount += getSquareCount(currentPointCount, curRow, curCol, startRow, startCol);
            }
        }

        return currentSquareCount;
    }

    private boolean hasPoint(int curRow, int curCol, int startRow, int startCol) {
        return matrix[curRow][curCol] != null &&
                matrix[startRow][curCol] != null &&
                matrix[curRow][startCol] != null;
    }

    private int getSquareCount(int currentPointCount, int curRow, int curCol, int startRow, int startCol) {
        return currentPointCount *
                matrix[curRow][curCol] *
                matrix[startRow][curCol] *
                matrix[curRow][startCol];
    }
}
