class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;
        int ptr = matrix[i][j];
        while (j >= 0 && i < matrix.length) {
            ptr = matrix[i][j];
            if (ptr == target) {
                return true;
            } else if (ptr > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;

    }
}