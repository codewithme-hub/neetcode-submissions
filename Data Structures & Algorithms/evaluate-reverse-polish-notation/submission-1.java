class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
         for(int i=0;i<tokens.length;i++){
            String token = tokens[i];
             if(!token.equals("+") && 
               !token.equals("-") && 
               !token.equals("*") && 
               !token.equals("/")) {

                st.push(Integer.parseInt(token));
            }
           else{
            int a = st.pop();
            int b = st.pop();
            if(token.equals("+")) st.push(b+a);
            if(token.equals("-")) st.push(b-a);
            if(token.equals("*")) st.push(b*a);
            if(token.equals("/")) st.push(b/a);
           }

         }  
         return st.pop();
    }
}
