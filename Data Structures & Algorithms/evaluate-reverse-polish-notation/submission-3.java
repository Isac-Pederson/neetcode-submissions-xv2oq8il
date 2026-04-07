class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 1){
            return Integer.parseInt(tokens[0]);
        }
        Stack<String> stack = new Stack<>(); 
        int num = 0;
        
        for(String token : tokens){
            if(token.equals("+")){
                    int firstNum = Integer.parseInt(stack.pop());
                    int secondNum = Integer.parseInt(stack.pop());
                    num = firstNum + secondNum;
                stack.push(Integer.toString(num));
                System.out.println(num);
            }else if(token.equals("-")){
                    int firstNum = Integer.parseInt(stack.pop());
                    int secondNum = Integer.parseInt(stack.pop());
                    num = secondNum - firstNum;
                stack.push(Integer.toString(num));
            }else if(token.equals("/")){
                    int firstNum = Integer.parseInt(stack.pop());
                    int secondNum = Integer.parseInt(stack.pop());
                    num = secondNum / firstNum;
                    stack.push(Integer.toString(num));
            }else if(token.equals("*")){
                    int firstNum = Integer.parseInt(stack.pop());
                    int secondNum = Integer.parseInt(stack.pop());
                    num = firstNum * secondNum;
                stack.push(Integer.toString(num));
                System.out.println(num);

            }else{
                stack.push(token);
            }
        }

        return num;

        
    }
}
