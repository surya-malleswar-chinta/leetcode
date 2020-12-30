class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] table = new int[256];
        for (int i = 0; i < allowed.length(); i++) {
            char ch = allowed.charAt(i);
            table[ch] = 1;
        }
        int count = 0;
        for (String word: words) {
            if (checkConsistency(table, word)) count++;
        }
        return count;
    }
    
    boolean checkConsistency(int[] table, String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (table[ch] != 1) return false;
        }
        
        return true;
    }
}