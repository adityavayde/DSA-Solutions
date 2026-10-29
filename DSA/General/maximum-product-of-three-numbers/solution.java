class Solution {
    public int maximumProduct(int[] nums) {
        // Initialize three largest numbers
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

        // Initialize two smallest numbers
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        // Traverse the array once
        for (int n : nums) {

            // Update three largest numbers
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }

            // Update two smallest numbers
            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }

        // Calculate both candidate products
        int product1 = max1 * max2 * max3;
        int product2 = min1 * min2 * max1;

        // Return the maximum product
        return Math.max(product1, product2);
    }
}
