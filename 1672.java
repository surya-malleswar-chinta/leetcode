class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for (int col = 0; col < accounts[0].length; col++) {
                sum += accounts[row][col];
            }
            max = Math.max(max, sum);
        }
        
        return max;
    }
}