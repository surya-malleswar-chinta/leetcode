class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length();) {
            if (i+1 <= command.length() && command.substring(i,i+1).equals("G")) {
                sb = sb.append("G");
                i  = i+1;
            } else if (i+2 <= command.length() && command.substring(i,i+2).equals("()")) {
                sb = sb.append("o");
                i = i+2;
            } else {
                sb = sb.append("al");
                i = i + 4;
            }
        }
        return sb.toString();
    }
}