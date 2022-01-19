class MinStack {
    
    Stack<Integer> min_stack;
    Stack<Integer> min_val;

    public MinStack() {
        min_stack = new Stack();
        min_val = new Stack();
    }
    
    public void push(int val) {
        min_stack.push(val);
        if(min_val.isEmpty() || min_val.peek() > val) min_val.push(val);
        else min_val.push(min_val.peek());
    }
    
    public void pop() {
        min_stack.pop();
        min_val.pop();
    }
    
    public int top() {
        return min_stack.peek();
    }
    
    public int getMin() {
        return min_val.peek(); 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */