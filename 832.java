class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        flip(A);
        invert(A);
        return A;
    }
    
    void flip(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int start = 0, end = A[0].length-1;
            while(start < end) {
                int temp = A[i][start];
                A[i][start] = A[i][end];
                A[i][end] = temp;
                start++;
                end--;
            }
        }
    }
    
    void invert(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == 0) A[i][j] = 1;
                else A[i][j] = 0;
            }
        }
    }
}