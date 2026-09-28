class Solution {
    public String findContestMatch(int n) {
        Deque<String> dq = new ArrayDeque<>();
        
        // Fill the deque with the initial teams
        for (int i = 1; i <= n; i++) {
            dq.addLast(Integer.toString(i));
        }
        
        /* Perform the pairing process
        until only one match remains */
        while (dq.size() > 1) {
            Deque<String> temp = new ArrayDeque<>();
            
            /* Pair the first and last 
            elements, add them to temp */
            while (!dq.isEmpty()) {
                String match = "(" + dq.removeFirst() + "," + dq.removeLast() + ")";
                temp.addLast(match);
            }
            // Move the results back to the main deque
            dq = temp;  
        }
        return dq.removeFirst();  
    }
}