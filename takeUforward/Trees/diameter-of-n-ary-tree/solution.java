class Solution {

    private int maxDiameter;

    private int height(TreeNode node) {

        if (node == null) {
            return 0;
        }

        int maxHeight1 = 0, maxHeight2 = 0;

        for (TreeNode child : node.children) {

            int parentHeight = height(child) + 1;

            if (parentHeight > maxHeight1) {
                maxHeight2 = maxHeight1;
                maxHeight1 = parentHeight;
            } else if (parentHeight > maxHeight2) {
                maxHeight2 = parentHeight;
            }

            int distance = maxHeight1 + maxHeight2;

            maxDiameter = Math.max(maxDiameter, distance);
        }

        return maxHeight1;
    }

    public int diameter(TreeNode root) {

        maxDiameter = 0;

        height(root);

        return maxDiameter;
    }
}