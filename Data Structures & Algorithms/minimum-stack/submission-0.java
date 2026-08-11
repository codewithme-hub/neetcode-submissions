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
    }
    
    public void pop() {
        top--;
    }
    
    public int top() {
        return stack[top];
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<=top;i++){
            min = Math.min(min,stack[i]);
        }
        return min;
    }
}
