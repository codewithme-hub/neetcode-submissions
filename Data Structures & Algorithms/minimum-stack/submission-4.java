class MinStack {
    long [] stack;
    int top;
    long min;
    public MinStack() {
       stack = new long[10000];
       top = -1; 
    }
    
    public void push(int val) {
       if(top==-1){
        top++;
        stack[top] = val;
        min = val;
       } 
       else if(val<min){
            top++;
            stack[top] = 2L * val - min;
            min = val;
       }
       else{
        top++;
        stack[top] = val;
       }
    }
    
    public void pop() {
        if(stack[top]<min){
            min = 2 * min - stack[top];
        }
        top--;
    }
    
    public int top() {
       if(stack[top]<min) return (int) min; 
       return (int) stack[top];
    }
    
    public int getMin() {
        return (int) min;
    }
}
