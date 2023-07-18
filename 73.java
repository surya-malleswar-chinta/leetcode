class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean isHeaderRowZero = false;
        boolean isHeaderColumnZero = false;
        
        for (int col = 0; col < cols; col++) {
            if (matrix[0][col] == 0) isHeaderRowZero = true;
        }
        
        for (int row = 0; row < rows; row++) {
            if (matrix[row][0] == 0) isHeaderColumnZero = true;
        }
        
        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }
        
        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                if (matrix[0][col] == 0 || matrix[row][0] == 0) {
                   matrix[row][col] = 0;
                }
            }
        }
        
        if (isHeaderRowZero) {
            for (int col = 0; col < cols; col++) {
                matrix[0][col] = 0;
            }
        }
        
        if(isHeaderColumnZero) {
            for (int row = 0; row < rows; row++) {
                matrix[row][0] = 0;
            }
        }
        
    }
}