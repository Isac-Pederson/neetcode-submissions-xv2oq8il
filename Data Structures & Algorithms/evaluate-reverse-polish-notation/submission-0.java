class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>(); 
        int num = 0;
        
        for(String token : tokens){
            if(token.equals("+")){
                while(!stack.empty()){
                    int firstNum = Integer.parseInt(stack.pop());
                    int secondNum = Integer.parseInt(stack.pop());
                    num = firstNum + secondNum;
                }
                stack.push(Integer.toString(num));
                System.out.println(num);
            }else if(token.equals("-")){
                while(!stack.empty()){
                    int firstNum = Integer.parseInt(stack.pop());
                    int secondNum = Integer.parseInt(stack.pop());
                    num = firstNum - secondNum;
                }
                stack.push(Integer.toString(num));
            }else if(token.equals("/")){
                while(!stack.empty()){
                    int firstNum = Integer.parseInt(stack.pop());
                    int secondNum = Integer.parseInt(stack.pop());
                    num = firstNum / secondNum;
                }
                stack.push(Integer.toString(num));
            }else if(token.equals("*")){
                while(!stack.empty()){
                    int firstNum = Integer.parseInt(stack.pop());
                    int secondNum = Integer.parseInt(stack.pop());
                    num = firstNum * secondNum;
                }
                stack.push(Integer.toString(num));
                System.out.println(num);

            }else{
                stack.push(token);
            }
        }

        return num;

        
    }
}
