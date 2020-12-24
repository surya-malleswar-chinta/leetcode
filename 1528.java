class Solution {
    public String restoreString(String s, int[] indices) {
        char[] chars = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            int index = indices[i];
            char ch = s.charAt(i);
            chars[index] = ch;
        }
        return new String(chars);
    }
}