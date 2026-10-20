class Solution {
    public int maxDepth(TreeNode root) {
        // If the tree is empty, return 0
        if (root == null) {
            return 0;
        }

        // Create a queue to hold nodes to be processed
        Queue<TreeNode> q = new LinkedList<>();
        // Push the root node into the queue
        q.add(root);
        // Initialize level to 0
        int level = 0;

        // While there are nodes in the queue
        while (!q.isEmpty()) {
            // Get the number of nodes at the current level
            int size = q.size();

            // Process all nodes at the current level
            for (int i = 0; i < size; i++) {
                // Get the front node in the queue
                TreeNode front = q.poll();

                // Enqueue left child if it exists
                if (front.left != null) {
                    q.add(front.left);
                }

                // Enqueue right child if it exists
                if (front.right != null) {
                    q.add(front.right);
                }
            }
            // Increment level to move to the next level
            level++;
        }

        // Return the maximum depth
        return level;
    }
}
