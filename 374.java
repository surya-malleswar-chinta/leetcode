public class Solution extends GuessGame {
    public int guessNumber(int n) {
        return guessNumber(1, n);
    }
    
    public int guessNumber(int start, int end) {
        int mid = start + (end-start)/2;
        int pick = guess(mid);
        if (pick == 0) return mid;
        if (pick < 0) {
            return guessNumber(start, mid-1);
        } else {
            return guessNumber(mid+1, end);
        }
    }
    /*Second approach*/
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while(low <= high) {
            int mid = low + (high-low)/2;
            int guess = guess(mid);
            if (guess == 0) return mid;
            if (guess < 0) high = mid-1;
            else low = mid+1;
        }

        return -1;
    }
}