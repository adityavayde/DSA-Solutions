class Solution {
    public int maxDepth(TreeNode root) {
        // Base case: if the node is null, return 0
        if (root == null) {
            return 0;
        }
        // Recursively find the depth of the left and right subtrees
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        // The depth of the tree is 1 current node + the maximum depth of the subtrees
        return 1 + Math.max(left, right);
    }
}