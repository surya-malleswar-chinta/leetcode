class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralList = new ArrayList<Integer>();
        
        if (matrix.length == 0) return spiralList;
        
        int startRow  = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;
        
        while (startRow <= endRow && startCol <= endCol) {
            //right
            for (int i = startCol; i <= endCol; i++) {
                spiralList.add(matrix[startRow][i]);
            }
            startRow++;
            //down
            for (int i = startRow; i <= endRow; i++) {
                spiralList.add(matrix[i][endCol]);
            }
            endCol--;
            //left
            //if conditions as we have changed these values in first two loops
            if (startRow <= endRow)
                for (int i = endCol; i >= startCol; i--) {
                    spiralList.add(matrix[endRow][i]);
                }
            endRow--;
            //up
            if (startCol <= endCol)
                for (int i = endRow; i >= startRow; i--) {
                    spiralList.add(matrix[i][startCol]);
                }
            startCol++;
        }
        
        return spiralList;
    }
}