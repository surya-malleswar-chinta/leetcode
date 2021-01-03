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

    /*Another approach*/

    public int[][] diagonalSort(int[][] mat) {
       //border ones and do i++,j++
        //first row, first col
        int m = mat.length;
        int n = mat[0].length;
        
        for (int row = 0; row < m; row++) {
            sort(mat, row, 0, m, n);
        }
        for (int col = 0; col < n; col++) {
            sort(mat, 0, col, m, n);
        }
        
        return mat;
    }
    
    public void sort(int[][] mat, int i, int j, int m, int n) {
        List<Integer> list = new ArrayList<>();
        while(i < m && j < n) {
            list.add(mat[i++][j++]);
        }
        Collections.sort(list);
        while(i >0 && j>0) {
            mat[--i][--j] = list.remove(list.size()-1);
        }
    }
}