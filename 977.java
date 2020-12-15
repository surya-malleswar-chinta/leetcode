class Solution {
    public int[] sortedSquares(int[] nums) {
        int size = nums.length;
        int[] sol = new int[size];
        int start = 0, end = size-1, k = size-1;
        while(start <= end){
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
              sol[k--] = nums[start] * nums[start];
              start++;  
            } else {
              sol[k--] = nums[end] * nums[end];
              end--;  
            }
        }
        
        return sol;
    }
}