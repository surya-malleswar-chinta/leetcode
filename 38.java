class Solution {
    public String countAndSay(int n) {
        String s = "1";
        if (n == 1) return s;
        for (int i = 1; i < n; i++) {
            s = zipNumString(s);
        }
        
        return s;
    }
    
    public static String zipNumString(String word) {
        if (word == null || word.length() == 0) return "";
        int length = word.length();
        int start = 0;
        StringBuilder zip = new StringBuilder();
        while(start < length) {
            char ch = word.charAt(start);
            int count = 1;
            
            while(start+1 < length && ch == word.charAt(start+1)) {
                count++;
                start++;
            }
            start++;
            zip = zip.append(count).append(ch);
        }
        
        return zip.toString();
    }
}