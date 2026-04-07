class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;


    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.empty()){
            minStack.push(val);
            stack.push(val);
        }else{
            stack.push(val);
            int minVal = minStack.peek();
            if(minVal > val){
                minStack.push(val);
            }else{
                minStack.push(minVal);
            }

        }
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
        
    }
    
    public int top() {
        if(stack.empty()){
            return 0;
        }
        return stack.peek();
    }
    
    public int getMin() {
        if(minStack.empty()){
            return 0;
        }
        return minStack.peek();
    }
}
