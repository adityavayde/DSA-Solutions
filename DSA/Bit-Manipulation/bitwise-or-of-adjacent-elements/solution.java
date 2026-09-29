class Solution {
    // Function to compute bitwise OR between every pair of adjacent elements
    public List<Integer> orArray(List<Integer> nums) {
        // Initialize the result list
        List<Integer> res = new ArrayList<>();

        // Get the size of the input list
        int n = nums.size();

        // Iterate through the list up to the second last element
        for (int i = 0; i < n - 1; i++) {
            // Compute bitwise OR between current and next element
            int temp = nums.get(i) | nums.get(i + 1);

            // Add result to output list
            res.add(temp);
        }

        // Return the final list
        return res;
    }
}