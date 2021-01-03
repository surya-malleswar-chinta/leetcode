class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1, j = 1, count = 1, prev = nums[0];
        
        while(i < nums.length) {
            nums[j] = nums[i];
            if (nums[i] == prev) {
                count++;
                if (count > 2) {
                    i++;
                } else {
                    i++;
                    j++;
                }
            } else {
                count = 1;
                prev = nums[i];
                i++;
                j++;
            }
        }
        
        return j;
    }
}