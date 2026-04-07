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
        }else{
            if(val <= minStack.peek()){
                minStack.push(val);
            }
        }
        stack.push(val);
        
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        int top = stack.pop();
        if(top == minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        if(minStack.empty()){
            return 0;
        }else{
            return minStack.peek();
        }
    }
}
