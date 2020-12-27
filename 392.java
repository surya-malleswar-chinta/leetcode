class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int m = s.length();
        int n = t.length();
        int i = 0, j = 0;
        
        while(i < m && j < n) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; j++;
            } else j++;
        }
        
        return i == m;
    }

    /*another way*/
    public boolean isSubsequence(String s, String t) {
        int allCharsFound = 0;
        for (int i = 0; i < t.length(); t++) {
            if (allCharsFound == s.length()) return true;
            if (t.charAt(i) == s.charAt(allCharsFound)) allCharsFound++;
        }
        return allCharsFound == s.length();
    }

}