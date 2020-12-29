class Solution {
    public int evalRPN(String[] tokens) {
        String[] chars = {"+", "-", "*", "/"};
        List<String> operators = Arrays.asList(chars);
        
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if (operators.contains(s)) {
                stack.push(res(stack.pop(), stack.pop(), s));
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        
        return stack.pop();
    }
    
    int res(int a, int b, String operator) {
        
        switch(operator) {
            case "+": return (b + a);
            case "-": return (b - a); 
            case "/": return (b / a); 
            case "*": return (b * a); 
        }
        return 1;
    }
}