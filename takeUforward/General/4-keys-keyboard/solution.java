class Solution {
    public int maxA(int n) {
        /* If n is less than or
         equal to 5, return n */
        if (n <= 5) {
            return n;
        }
        
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        // Call the helper function
        return helper(n, dp);
    }
    private int helper(int n, int[] dp) {
        // Base case: if n <= 5, return n
        if (n <= 5) {
            return n;
        }
        /* If already calculated, 
        return the memoized result */
        if (dp[n] != -1) {
            return dp[n];
        }
        // Press 'A' operation
        int result = helper(n - 1, dp) + 1;

        // Try all copy-paste combinations
        for (int i = 1; i <= 4; i++) {
            if (n - i - 2 >= 1) {
                int current = helper(n - i - 2, dp) * (i + 1);
                result = Math.max(result, current);
            }
        }
        // Store result in memo array
        dp[n] = result;
        return result;
    }
}