class Solution {
    
    private void insertAtBottom(Stack<Integer> st, int top) {
        
        if(st.isEmpty()) {
            st.push(top);
            return;
        }
        
        int temp = st.pop();
        
        insertAtBottom(st, top);
        
        st.push(temp);
    }
    
    public void reverseStack(Stack<Integer> st) {
        
        if(st.isEmpty()) {
            return;
        }
        
        int top = st.pop();
        
        reverseStack(st);
        
        insertAtBottom(st, top);
    }
}
