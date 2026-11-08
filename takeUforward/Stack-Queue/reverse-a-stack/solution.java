class Solution {
    // Helper method to insert element at bottom
    private void insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }
        int top = st.pop();
        insertAtBottom(st, x);
        st.push(top);
    }

    // Recursive stack reversal
    public void reverseStack(Stack<Integer> st) {
        if (st.isEmpty()) return;

        int top = st.pop();
        reverseStack(st);
        insertAtBottom(st, top);
    }
}