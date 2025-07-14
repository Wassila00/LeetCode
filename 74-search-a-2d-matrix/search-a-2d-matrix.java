class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int up = 0, down = m - 1;

        // Binary search to find the correct row
        while (up <= down) {
            int midRow = up + (down - up) / 2;

            if (target < matrix[midRow][0]) {
                down = midRow - 1;
            } else if (target > matrix[midRow][n - 1]) {
                up = midRow + 1;
            } else {
                // target may be in this row
                int left = 0, right = n - 1;
                while (left <= right) {
                    int midCol = left + (right - left) / 2;
                    if (matrix[midRow][midCol] == target) {
                        return true;
                    } else if (matrix[midRow][midCol] < target) {
                        left = midCol + 1;
                    } else {
                        right = midCol - 1;
                    }
                }
                return false; // target not in this row
            }
        }

        return false;
    }
}
