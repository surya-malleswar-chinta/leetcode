class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> sol = new ArrayList<Integer>();
        for (int num = left; num <= right; num++) {
            boolean selfDividing = true;
            int number = num;
            while (number > 0 && selfDividing) {
                int digit = number % 10;
                if (digit == 0 || num%digit !=0) 
                	selfDividing = false;

                number = number/10;
            }
            
            if (selfDividing) sol.add(num);
        }
        
        return sol;
    }
}