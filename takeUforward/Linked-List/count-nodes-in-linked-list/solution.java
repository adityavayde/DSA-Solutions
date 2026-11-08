// Definition of singly linked list:
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() { val = 0; next = null; }
//     ListNode(int val) { this.val = val; next = null; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

class Solution {
    // Function to count total nodes in the linked list
    public int countNodes(ListNode head) {
        // Initialize counter to 0
        int count = 0;
        // Start traversal from head node
        ListNode current = head;
        // Traverse until end of list
        while(current != null) {
            // Increment counter for each node
            count++;
            // Move to next node
            current = current.next;
        }
        // Return total node count
        return count;
    }
}