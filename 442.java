class Solution {

    /*
        Make the num at every index to negative
        if the num at an index is already negative, that number already exists
    */

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dupes = new ArrayList<>();
        
        for (int num: nums) {
            int n = Math.abs(num);
            int index = n-1;
            if (nums[index] < 0) dupes.add(n);
            nums[index] = -1 * nums[index];
        }
        
        return dupes;
    }
}