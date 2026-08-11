class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int [] ans = new int [n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            // day agr warmer hai hi nhi toh remove kr dete hai...
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]) st.pop();
            // ab agr warmer day milay toh 
            if(!st.isEmpty()) ans[i] = st.peek() - i;
            st.push(i);
        }
        return ans;
    }
}
