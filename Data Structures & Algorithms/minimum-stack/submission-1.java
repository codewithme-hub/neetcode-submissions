class MinStack {
    int [] stack;
    int [] minstack;
    int top; 
    public MinStack() {
        stack = new int[10000];
        minstack = new int[10000];
        top = -1;
    }
    
    public void push(int val) {
        top++;
        stack[top] = val; 
        if(top==0) minstack[top] = val;
        else{
            minstack[top] = Math.min(val,minstack[top-1]);
        }  
    }
    
    public void pop() {
        top--;
    }
    
    public int top() {
        return stack[top];
    }
    
    public int getMin() {
        return minstack[top];
    }
}
