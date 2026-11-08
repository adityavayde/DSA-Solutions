// BSTIterator class with in-order traversal and next/prev functionality
class BSTIterator {
    private List<Integer> inorder;  // List to store the inorder traversal of the tree
    private int index;  // Index to keep track of the current position in the inorder list

    // Helper function to perform in-order traversal
    private void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);  // Traverse left subtree
        inorder.add(root.data);  // Visit the node
        inOrder(root.right);  // Traverse right subtree
    }

    public BSTIterator(TreeNode root) {
        inorder = new ArrayList<>();
        inOrder(root);
        index = -1;  // Initially before the first element
    }

    public boolean hasNext() {
        return index + 1 < inorder.size();
    }

    public int next() {
        if (hasNext()) {
            index++;
            return inorder.get(index);
        }
        return -1;  // Should never be called if hasNext() is false
    }

    public boolean hasPrev() {
        return index - 1 >= 0;
    }

    public int prev() {
        if (hasPrev()) {
            index--;
            return inorder.get(index);
        }
        return -1;  // Should never be called if hasPrev() is false
    }
}