class Solution {
    public boolean isIsomorphic(String s, String t) {
        return Arrays.equals(pattern(s), pattern(t));
    }
    
    int[] pattern(String w) {
        int len = w.length();
        int[] res = new int[len];
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            char ch = w.charAt(i);
            map.putIfAbsent(ch, map.size());
            res[i] = map.get(ch);
        }
        return res;
    }

    /*Another approach*/
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) return false;
        int n = s.length();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (arr1[c1] != arr2[c2]) return false;
            arr1[c1] = i+1;
            arr2[c2] = i+1;
        }

        return true;
    }
}