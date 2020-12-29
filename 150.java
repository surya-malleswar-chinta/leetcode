class Solution {
    public int evalRPN(String[] tokens) {
        String[] chars = {"+", "-", "*", "/"};
        List<String> operators = Arrays.asList(chars);
        
        Stack<String> stack = new Stack<>();
        for (String s : tokens) {
            if (operators.contains(s)) {
                stack.push(res(stack.pop(), stack.pop(), s));
            } else {
                stack.push(s);
            }
        }
        
        return Integer.parseInt(stack.pop());
    }
    
    String res(String first, String second, String operator) {
        int a = Integer.parseInt(first);
        int b = Integer.parseInt(second);
        
        switch(operator) {
            case "+": return (b + a) + "";
            case "-": return (b - a) + "";
            case "/": return (b / a) + "";
            case "*": return (b * a) + "";
        }
        return "";
    }
}