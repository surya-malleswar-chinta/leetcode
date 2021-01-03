class Solution {
    public int[][] diagonalSort(int[][] mat) {
       //border ones and do i++,j++
        //first row, first col
        int rows = mat.length;
        int cols = mat[0].length;
        int i,j;
        List<Integer> list = new ArrayList<>();
        for (int row = 0; row < rows; row++) {
            int col = 0;
            int curRow = row;
            list = new ArrayList<>();
            while (row < rows && col < cols) {
                list.add(mat[row++][col++]);
            }
            Collections.sort(list);
            int index = 0;
            row = curRow;
            col = 0;
            while (index < list.size()) {
                mat[row++][col++] = list.get(index++);
            }
            row = curRow;
        }
        for (int col = 0; col < cols; col++) {
            int row = 0;
            int curCol = col;
            list = new ArrayList<>();
            while (row < rows && col < cols) {
                list.add(mat[row++][col++]);
            }
            Collections.sort(list);
            int index = 0;
            row = 0;
            col = curCol;
            while (index < list.size()) {
                mat[row++][col++] = list.get(index++);
            }
            col = curCol;
        }
        
        return mat;
    }
}