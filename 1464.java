class Solution {
    public int maxProduct(int[] nums) {
        int largest, secondLargest;
        if (nums[0] > nums[1]) {
            largest = 0;
            secondLargest = 1;
        } else {
            largest = 1;
            secondLargest = 0;
        }
        
        for (int i = 2; i < nums.length; i++) {
            if (nums[largest] < nums[i]) {
                secondLargest = largest;
                largest = i;
            } else if (nums[secondLargest] < nums[i]) {
                secondLargest = i;
            }
        }
        
        return (nums[largest]-1) * (nums[secondLargest]-1);
    }
}